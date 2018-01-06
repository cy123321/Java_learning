package CollectionUsing;

import java.util.*;

public class CountOccurrenceOfWords {
    public static void main(String[] args) {
        String text = "Have a good day. Have a good class. " + "Have a good visit. Have fun!";
        // Create a hash map to hold words as key and count as value
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        String[] words = text.split("[ .!?]");
        System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length; i++){
            if(words[i].length()  > 1) {
                if(map.get(words[i]) != null) {
                    int value = map.get(words[i]).intValue();
                    value++;
                    map.put(words[i],value);
                }
                else
                    map.put(words[i],1);
            }
        }
        //Get all entries into a set
        Set<Map.Entry<String ,Integer>> entrySet = map.entrySet();
        //Get key and value from each entry
        for(Map.Entry<String ,Integer> entry:entrySet) {
            System.out.println(entry.getValue() + "\t" + entry.getKey());
        }
    }
}
