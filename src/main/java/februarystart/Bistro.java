package februarystart;

import java.util.*;

public class Bistro implements Iterator {

    private String classname;
    private TreeSet<Dish> dishesMap;
    private TreeSet<Order> ordersMap;                    /// new TreeSet<>(getOrders());
    private TreeSet<Waiter> waitersMap;
    private TreeSet<SideDish> sideDishesMap;

    private static Bistro instance;
    private Dish dish;


    public Bistro(TreeSet<Dish> dishesMap, TreeSet<Order> ordersMap, TreeSet<Waiter> waitersMap, TreeSet<SideDish> sideDishesMap) {
        this.dishesMap = dishesMap;
        this.ordersMap = ordersMap;
        this.waitersMap = waitersMap;
        this.sideDishesMap = sideDishesMap;
    }

    private Bistro(String classname) {
        this.classname = classname;
        dishesMap = new TreeSet<Dish>();
        ordersMap = new TreeSet<Order>();
        waitersMap = new TreeSet<Waiter>();
        sideDishesMap = new TreeSet<SideDish>();


    }



    public static Bistro getInstance(String classname) {
        if (instance == null)
            instance = new Bistro(classname);
        return instance;
    }







    public void addDish(Dish dishesMap) {
        dishesMap.add(sideDishesMap);
    }

    public void addOrder(Order ordersMap) {
        ordersMap.add(ordersMap);
    }

    public void addWaiter(Waiter waiter) {
        waitersMap.add(waiter);

    }

    public void decorateDish(Dish dish, SideDish sideDish) {
        this.dish = dish;
        dishesMap.add(new Dish(sideDish));
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

        iterator = ordersMap.iterator();

        while (iterator.hasNext()) {
            return iterator;

        }

        return null;
    }
}

