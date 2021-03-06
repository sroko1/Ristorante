package februarystart;

import java.util.ArrayList;
import java.util.List;

public class SideDish implements Comparable {

    private String name;
    private int weight;
    private int calories;
    private double price;

    private List<Ingredient>sideIngredients = new ArrayList<>();

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

    public List<Ingredient> getSideIngredients() {
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

    @Override
    public int compareTo(Object o) {
        return name.compareTo(getName());
    }
}
