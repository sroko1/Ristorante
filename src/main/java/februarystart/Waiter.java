package februarystart;

public class Waiter extends Person {

   private static double totalRevenue;

    public Waiter(String firstName, String lastName) {
        super(firstName, lastName);
    }




    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }

    public void add(Waiter waiterMap) {

    }


    @Override
    public int compareTo(Object o) {
        return super.getLastName().compareTo(getLastName());
    }
}
