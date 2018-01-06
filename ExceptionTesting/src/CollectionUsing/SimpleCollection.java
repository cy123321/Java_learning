package CollectionUsing;

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args){
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i=0;i<10;i++)
            c.add(i); //Autoboxing
        for(Integer i:c)
            System.out.println(i);
        Iterator<Integer> it = c.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList rawList = new ArrayList();

        System.out.println(intList.getClass().getSimpleName());
        System.out.println(rawList.getClass().getSimpleName());
    }
}
