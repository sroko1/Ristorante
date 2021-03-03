package februarystart;

import java.util.Comparator;

public class OrderNameComparator implements Comparator<Order> {


    @Override
    public int compare(Order o1, Order o2) {
        int res = o1.getDish().compareTo(o2.getDish());
        if (res == 0)
            return o1.getOrderDateTime().compareTo(o2.getOrderDateTime());
        else
            return res;
    }
}
