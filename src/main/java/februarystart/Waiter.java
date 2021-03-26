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


   /* @Override
    public int compareTo(Waiter w1, Waiter w2) {

        int res = w1.getFirstName().compareTo(w2.getFirstName());
        if (res == 0)
            return w1.getLastName().compareTo(w2.getLastName());
        else
            return res;
    }
*/
    @Override
    public int compareTo(Object o) {

        int res = super.getFirstName().compareTo(getFirstName());
        if (res == 0)
            return super.getLastName().compareTo(getLastName());
        else
            return res;
    }

}