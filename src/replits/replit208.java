package replits;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class replit208 {

        public static void main(String[] args) {
            HashMap<String,Integer> map = new HashMap<>();

            map.put("mango", 10);
            map.put("apple", 30);
            map.put("orange", 20);
           display(map);
           map.clear();
           display(map);
        }

    static void display(Map<String,Integer> map) {
        Set<Map.Entry<String,Integer>> items = map.entrySet();
        if (map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            for(Map.Entry <String,Integer> item:items){
                String key = item.getKey();
                Integer value = item.getValue();
                System.out.println(key+":"+value);
            }

        }
    }

        }



