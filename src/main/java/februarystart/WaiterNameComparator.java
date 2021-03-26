package februarystart;

import java.util.Comparator;

public class WaiterNameComparator implements Comparator<Waiter> {
    @Override
    public int compare(Waiter o1, Waiter o2) {

        int res = o1.getFirstName().compareTo(o2.getFirstName());
        if (res == 0)
            return o1.getLastName().compareTo(o2.getLastName());
        else
            return res;
    }
    }

