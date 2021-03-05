package februarystart;

import java.util.*;

public class Bistro implements Iterator{

    private String classname;
    private Set<Dish> dishSet;
    private Set<Order> orderSet;                    /// new TreeSet<>(getOrders());
    private Set<Waiter> waiterSet;
    private Set<SideDish> sideDishSet;

    private static Bistro instance;
    private Dish dish;


    //public Bistro(TreeSet<Dish> dishesMap, TreeSet<Order> ordersMap, TreeSet<Waiter> waitersMap, TreeSet<SideDish> sideDishesMap) {
      //  this.dishesMap = dishesMap;
      //  this.ordersMap = ordersMap;
       // this.waitersMap = waitersMap;
       // this.sideDishesMap = sideDishesMap;
   // }

    private Bistro(String classname) {
        this.classname = classname;
        dishSet = new TreeSet<Dish>();
        orderSet = new TreeSet<Order>();
        waiterSet = new TreeSet<>();
      // sideDishSet = new TreeSet<>();

    }

    public static Bistro getInstance(String classname) {
        if (instance == null)
            instance = new Bistro(classname);
        return instance;
    }

    public void addDish(Dish dish) {
        dishSet.add(dish);
    }
    public TreeSet<Dish>getAllDishes(){
        return (TreeSet<Dish>) dishSet;
    }


    public void addOrder(Order order) {
        orderSet.add(order);
    }
    public TreeSet<Order>getAllOrders(){
        return (TreeSet<Order>) orderSet;
    }

    public void addWaiter(Waiter waiter) {
        waiterSet.add(waiter);
    }
    public TreeSet<Waiter>getAllWaiters(){
        return (TreeSet<Waiter>) waiterSet;
    }



    public void decorateDish(Dish dish, SideDish sideDish) {
        this.dish = dish;
        dishSet.add(new Dish(sideDish));
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }





    Iterator iterator;

    public Iterator getIterator() {

        iterator = orderSet.iterator();

        while (iterator.hasNext()) {
            return iterator;

        }

        return null;
    }



}

