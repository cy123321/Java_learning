package CollectionUsing;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        // map to hold student grades
        Map<String ,Integer> themap = new HashMap<String, Integer>();
        themap.put("first",1);
        themap.put("second",2);
        themap.put("third",3);
        System.out.println(themap);
        System.out.println(themap.get("first"));
        System.out.println(themap.get(2));
    }
}
