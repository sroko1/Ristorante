package februarystart;

import java.time.LocalDateTime;
import java.util.Objects;

public class Order extends OrderNameComparator {

    private final Dish dish;
    private final Client client;
    private final Waiter waiter;
    private final LocalDateTime orderDateTime;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(dish, order.dish) && Objects.equals(client, order.client) && Objects.equals(waiter, order.waiter) && Objects.equals(orderDateTime, order.orderDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dish, client, waiter, orderDateTime);
    }

   // @Override
   // public int compareTo(Object o) {
   //     return this.orderDateTime.compareTo(((Order)o).getOrderDateTime());
  //  }
    }
