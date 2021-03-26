package februarystart;

import java.util.*;

public class Bistro extends OrderNameComparator {

    private String classname;
    private final Set<Dish> dishSet;
    private final Set<Order> orderSet;                    /// new TreeSet<>(getOrders());
    private final Set<Waiter> waiterSet;
    private final Set<SideDish> sideDishSet;


    private static Bistro instance;
    private Dish dish;


    /* public Bistro(TreeSet<Dish> dishSet, TreeSet<Order> orderSet, TreeSet<Waiter> waiterSet, TreeSet<SideDish> sideDishSet) {
         this.dishSet = dishSet;
         this.orderSet = orderSet;
         this.waiterSet = waiterSet;
         this.sideDishSet = sideDishSet;
     }
 */
    private Bistro(String classname) {
        this.classname = classname;
        dishSet = new TreeSet<Dish>(new DishNameComparator());
        orderSet = new TreeSet<Order>(new OrderNameComparator());
        waiterSet = new TreeSet<Waiter>(new WaiterNameComparator());
        sideDishSet = new TreeSet<>();

    }

    public static Bistro getInstance(String classname) {
        if (instance == null)
            instance = new Bistro(classname);
        return instance;
    }

    public void addDish(Dish dish) throws BistroException {
        while (dish.getCategory().equals(Category.VEGE)) {
            if (dish.getIngredients().toString().contains("Chicken") ||
                    dish.getIngredients().toString().contains("Turkey") ||
                    dish.getIngredients().toString().contains("Pork")
            )
                throw new BistroException("This is not vege");
        }

          dishSet.add(dish);
    }



    public void addSideDish(SideDish sideDish) {
        sideDishSet.add((sideDish));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bistro bistro = (Bistro) o;
        return Objects.equals(classname, bistro.classname) && Objects.equals(dishSet, bistro.dishSet) && Objects.equals(orderSet, bistro.orderSet) && Objects.equals(waiterSet, bistro.waiterSet) && Objects.equals(sideDishSet, bistro.sideDishSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classname, dishSet, orderSet, waiterSet, sideDishSet);
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


    Iterator iterator;
    public Order getOrdersIterator() {
        iterator = orderSet.iterator();
        if (iterator.hasNext()) {
            return orderSet.iterator().next();
        }
        return null;
    }


    }















