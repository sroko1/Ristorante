package februarystart;

public class Client extends Person{

    protected String firstName;
    protected String lastName;

    public Client(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;


    }


    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.firstName.compareTo(getFirstName());
    }
}
