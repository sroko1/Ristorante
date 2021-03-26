package februarystart;

import java.util.Comparator;

public class DishNameComparator implements Comparator<Dish> {


    @Override
    public int compare(Dish o1, Dish o2) {
      int res = o1.getName().compareTo(o2.getName());
        if (res == 0)
            return o1.getCategory().compareTo(o2.getCategory());
        else
            return res;
    }
}


