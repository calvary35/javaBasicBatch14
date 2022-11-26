package replits;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class replit207 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");
        Set<Map.Entry<String,String>> values = map.entrySet();

        Iterator<Map.Entry<String,String>> iterator = values.iterator();

        while(iterator.hasNext()){

            Map.Entry items = iterator.next();

            Object key = items.getKey();
            Object value = items.getValue();
            System.out.println(key +" : "+value);
        }
        System.out.println("HashMap After Replace :");



        Set<Map.Entry<String,String>> value = map.entrySet();
        Iterator<Map.Entry<String,String>> it = value.iterator();
       while (it.hasNext()){
           Map.Entry newItems = it.next();

           Object key = newItems.getKey();
           Object valu = newItems.getValue().toString();
           if(key.equals("THREE")){
               valu="ASEL";
           }
           if(key.equals("FIVE")){
               valu="SUMAIR";
           }
           System.out.println(key +" : "+valu);
       }





    }
}
