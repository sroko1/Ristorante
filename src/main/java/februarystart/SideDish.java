package februarystart;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SideDish extends SideDishComparator {

    private String name;
    private int weight;
    private int calories;
    private double price;

    private final List<Dish>sideIngredients = new ArrayList<>();

    public SideDish(String name, int weight, int calories, double price) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
        this.price = price;
    }
    public SideDish(){

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public List<Dish> getSideIngredients() {
        return sideIngredients;
    }




    @Override
    public String toString() {
        return "SideDish{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                ", price=" + price +
                ", sideIngredients=" + sideIngredients +
                '}';
    }


    public int compareTo(String name) {
        return this.name.compareTo( name);
    }
}
