package februarystart;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Dish {


    private Object sideDish = new Object();
    private String name;
    private double price;
    private Category category;

    private List<Ingredient> ingredients = new ArrayList<>();
    private List<SideDish>sideIngredients = new ArrayList<>();

    public Dish(String name){
        this.name= name;
    }

    public Dish(String name, double price, Category category, List<Ingredient> ingredients,List<SideDish>sideIngredients) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.ingredients = ingredients;
        this.sideIngredients = sideIngredients;
    }

    public Dish(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Dish(SideDish sideDish) {
        this.sideDish = sideDish;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<SideDish> getSideIngredients() {
        return sideIngredients;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", ingredients=" + ingredients +
                ", sideIngredients=" + sideIngredients +
                '}';
    }


    public int compareTo(Dish dish) {
return name.compareTo(dish.name);
    }

    public void add(Dish sideDishesMap) {
    }
}




