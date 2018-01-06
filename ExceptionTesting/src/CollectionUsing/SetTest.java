package CollectionUsing;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set ss = new LinkedHashSet();
        for(int i = 0; i < args.length; i++)
            ss.add(args[i]);
        Iterator i = ss.iterator();
        for(Object element : ss)
            System.out.println(element.toString() + " ");
    }
}
