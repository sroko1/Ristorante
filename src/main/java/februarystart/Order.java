package februarystart;

import java.time.LocalDateTime;

public class Order {

private Dish dish;
private Client client;
private Waiter waiter;
private LocalDateTime orderDateTime;






    public Order(Dish dish, Client client, Waiter waiter, LocalDateTime orderDateTime) {
        this.dish = dish;
        this.client = client;
        this.waiter = waiter;
        this.orderDateTime = orderDateTime;
    }

    public Dish getDish() {
        return dish;
    }

    public Client getClient() {
        return client;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public LocalDateTime getOrderDateTime() {
        return orderDateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "dish=" + dish +
                ", client=" + client +
                ", waiter=" + waiter +
                ", dateTime=" + orderDateTime +
                '}';
    }


}
