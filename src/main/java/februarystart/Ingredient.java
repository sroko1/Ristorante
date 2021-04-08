package februarystart;

public class Ingredient  {


    private final String name;
    private final int weight;
    private final int calories;

    public Ingredient(String name, int weight, int calories) {
        this.name = name;
        this.weight = weight ;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                '}';
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
}

