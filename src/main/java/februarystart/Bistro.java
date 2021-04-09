package februarystart;

import java.io.*;
import java.util.*;

public class Bistro extends OrderNameComparator {

    private final String classname;
    private final Set<Dish> dishSet;
    private final Set<Order> orderSet;                    /// new TreeSet<>(getOrders());
    private final Set<Waiter> waiterSet;
    private final Set<SideDish> sideDishSet;


    private static Bistro instance;
    private Dish dish;

    String filePath = "C:\\Users\\Marcin\\IdeaProjects\\AnotherMonday\\BistroSettings.txt";
    final int weightLimit = 250;
    //FileWriter fileWriter = null;

    {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(Integer.toString(weightLimit));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Bistro(String classname) {
        this.classname = classname;
        dishSet = new TreeSet<Dish>(new DishNameComparator());
        orderSet = new TreeSet<Order>(new OrderNameComparator());
        waiterSet = new TreeSet<Waiter>(new WaiterNameComparator());
        sideDishSet = new TreeSet<SideDish>(new SideDishComparator());

    }

    public static Bistro getInstance(String classname) {
        if (instance == null)
            instance = new Bistro(classname);
        return instance;
    }


    public void addDish(Dish dish) throws BistroException {
        while (dish.getCategory().equals(Category.VEGE)) {
            if (dish.hasIngredient("Chicken%") ||
                    dish.hasIngredient("Turkey%") || dish.hasIngredient("Pork%"))
               {

                throw new BistroException("This is not vege");
               }
        }
        while (dish.getCategory().equals(Category.SOUP)) {

            if (dish.hasSideIngredient(dish))
               {
                throw new BistroException("Sorry, we are not prepare for crazy mix");
            }
        }

        while (!(dish.getCategory().equals((Category.SOUP))|| (dish.getCategory().equals(Category.VEGE)))) {

            if (dish.sumOfWeightExtras() > weightLimit)
            {
                throw new BistroException("To much, Keep eye on your stomach");
            }
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















