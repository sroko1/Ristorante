package februarystart;

import java.util.*;

public class Bistro {

    private String classname;
    private final Set<Dish> dishSet;
    private Set<Order> orderSet;                    /// new TreeSet<>(getOrders());
    private final Set<Waiter> waiterSet;
    private final Set<SideDish> sideDishSet;

    private static Bistro instance;
    private Dish dish;


    public Bistro(TreeSet<Dish> dishSet, TreeSet<Order> orderSet, TreeSet<Waiter> waiterSet, TreeSet<SideDish> sideDishSet) {
        this.dishSet = dishSet;
        this.orderSet = orderSet;
        this.waiterSet = waiterSet;
        this.sideDishSet = sideDishSet;
    }

    private Bistro(String classname) {
        this.classname = classname;
        dishSet = new TreeSet<Dish>();
        orderSet = new TreeSet<Order>();
        waiterSet = new TreeSet<>();
        sideDishSet = new TreeSet<>();

    }

    public static Bistro getInstance(String classname) {
        if (instance == null)
            instance = new Bistro(classname);
        return instance;
    }

    public void addDish(Dish dish) {
        dishSet.add(dish);
    }
    public void addSideDish(SideDish sideDish) {
        dishSet.add(dish);
    }
    public TreeSet<SideDish> getAllSideDishes() {
        return (TreeSet<SideDish>) sideDishSet;
    }

    public TreeSet<Dish> getAllDishes() {
        return (TreeSet<Dish>) dishSet;
    }


    public void addOrder(Order order) {
        orderSet.add(order);
    }

    public TreeSet<Order> getAllOrders() {
        return (TreeSet<Order>) orderSet;
    }

    public void addWaiter(Waiter waiter) {
        waiterSet.add(waiter);
    }

    public TreeSet<Waiter> getAllWaiters() {
        return (TreeSet<Waiter>) waiterSet;
    }


    public void decorateDish(Dish dish, SideDish sideDish) {
        this.dish = dish;
        dishSet.add(new Dish(sideDish));
    }


    TreeSet<Order> orderTreeSet = new TreeSet<>();
    Iterator value = orderTreeSet.iterator();

    public Iterator<Order> getOrdersIterator() {
        if (value.hasNext()) {
             return orderTreeSet.iterator();
        }
        return null;
    }


}









