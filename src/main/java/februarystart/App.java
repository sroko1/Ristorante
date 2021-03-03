package februarystart;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

import static februarystart.Bistro.getInstance;

public class App {

    public static void main(String[] args)  {

        Bistro bistro = getInstance("U Bolka");


        Ingredient ing1 = new Ingredient("Pepper", 220, 250);
        Ingredient ing2 = new Ingredient("Tomatoes", 180, 140);
        Ingredient ing3 = new Ingredient("Pork Ribs", 140, 100);
        Ingredient ing4 = new Ingredient("Eggs", 50, 10);
        Ingredient ing5 = new Ingredient("Blue Cheese", 100, 120);
        Ingredient ing6 = new Ingredient("Chicken  Strips", 30, 3);
        Ingredient ing7 = new Ingredient("Potates", 220, 170);
        Ingredient ing8 = new Ingredient("Banana", 76, 101);
        Ingredient ing9 = new Ingredient("Pickles", 23, 56);
        Ingredient ing10 = new Ingredient("Boiled Salmon", 70, 43);


        SideDish sideDish1 = new SideDish("MushroomsWithBread", 56, 230, 45.6);
        SideDish sideDish2 = new SideDish("CarrotsWithPeas", 78, 130, 67.8);
        SideDish sideDish3 = new SideDish("FrogTongue", 89, 214, 340);

        Dish d1 = new Dish("BigPorky", 220.1, Category.MEAT, List.of(ing1, ing3), null);
        Dish d2 = new Dish("OakHawk", 130.9, Category.FLOURDISH);
        Dish d3 = new Dish("BearHope", 460.4, Category.FISH, null, List.of(sideDish1));
        Dish d4 = new Dish("HuntPlant", 200.0, Category.VEGE);
        Dish d5 = new Dish("Chips", 45.5, Category.OTHERS);
        Dish d6 = new Dish("FlyHigh", 250.2, Category.SOUP);
        Dish d7 = new Dish("AssShake", 167.2, Category.MILKDISH);


        Waiter wa1 = new Waiter("John", "Dogg");
        Waiter wa2 = new Waiter("Randy", "Catt");
        Waiter wa3 = new Waiter("Pit", "Cobbra");




        Client client1 = new Client("Pike", "Pyson");
        Client client2 = new Client("Evan", "King");
        Client client3 = new Client("Brruce", "Pee");
        Client client4 = new Client("Paul", "Knight");
        Client client5 = new Client("Steve", "Plum");
        Client client6 = new Client("Jack", "Giga");






        Order order1 = new Order(d1,client1,wa1,LocalDateTime.of(2021,11,11,14,12));
        Order order2 = new Order(d2,client2,wa2,LocalDateTime.of(2021,2,26,14,45));
        Order order3 = new Order(d3,client3,wa3,LocalDateTime.of(2021,9,2,12,15));
        Order order4 = new Order(d1,client2,wa2,LocalDateTime.of(2021,9,2,15,15));
        Order order5 = new Order(d2,client1,wa1,LocalDateTime.of(2021,2,26,12,15));


        bistro.addOrder(order1);
        bistro.addOrder(order2);
        bistro.addOrder(order3);
        bistro.addOrder(order4);
        bistro.addOrder(order5);

        bistro.addWaiter(wa1);
        bistro.addWaiter(wa2);
        bistro.addWaiter(wa3);

        bistro.addDish(d1);
        bistro.addDish(d3);
        bistro.addDish(d2);
        bistro.addDish(d4);
        bistro.addDish(d5);
        bistro.addDish(d6);
        bistro.addDish(d7);

        bistro.decorateDish(d1,sideDish1);
        bistro.decorateDish(d2,sideDish2);
        bistro.decorateDish(d3,sideDish3);





        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(sideDish2);
        System.out.println(client1);
        System.out.println();
        bistro.getIterator();
        System.out.println(bistro.getIterator());




       // System.out.println(order1.getDish().getName());
       // System.out.println(order2.getDish().getName());


    }
}
