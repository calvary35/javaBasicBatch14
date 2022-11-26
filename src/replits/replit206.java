package replits;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class replit206 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();

        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");


        Set<Map.Entry<String,String>> values = map.entrySet();
        System.out.println("HashMap Before Remove :");
        for(Map.Entry<String,String> value:values){
            String key =value.getKey();
            String val= value.getValue();
            System.out.println(key+" : "+val);
        }
        System.out.println("------------------");

        Set<Map.Entry<String,String>> newValues = map.entrySet();
        System.out.println("HashMap After Remove :");

        newValues.removeIf(x->(x.getKey().equals("ONE")||x.getKey().equals("FOUR")));
        System.out.println(newValues);


    }
}
