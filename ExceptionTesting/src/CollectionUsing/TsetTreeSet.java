package CollectionUsing;

import java.util.*;

public class TsetTreeSet {
    public static void main(String[] args) {
        // Create a hash set
        Set set = new HashSet();
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        for (Object element: set)
            System.out.print(element.toString() + " ");
        System.out.println();
        TreeSet treeSet = new TreeSet(set);
        System.out.println(treeSet);
    }
}
