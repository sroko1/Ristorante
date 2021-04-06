package februarystart;

import java.util.Comparator;

public class SideDishComparator implements Comparator<SideDish> {
    @Override
    public int compare(SideDish o1, SideDish o2) {


        return o1.getName().compareTo(o2.getName());


        }

    }
