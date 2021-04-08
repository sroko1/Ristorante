package februarystart;

public class SideIngredient {
    private final String name;
    private final int weight;
    private final int calories;

    public SideIngredient(String name, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
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

    @Override
    public String toString() {
        return "SideIngredient{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", calories=" + calories +
                '}';
    }
}
