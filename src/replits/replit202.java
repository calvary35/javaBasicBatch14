package replits;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class replit202 {
    public static void main(String[] args) {
        TreeMap<String, String> values = new TreeMap<>();
        values.put("1 item","apple");
        values.put("2 item","banana");
        values.put("3 item","pear");
        values.put("4 item","tomato");
        values.put("5 item","mango");
        values.put("6 item","kiwi");

        Set<Map.Entry<String, String>> set = values.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, String>mentry = iterator.next();
            System.out.println("key is: "+ mentry.getKey() + " & Value is: "+ mentry.getValue());

       }
    }
}
