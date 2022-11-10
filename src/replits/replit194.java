package replits;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class replit194 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Iterator<String> it = countries.iterator();
        while(it.hasNext()){
            String country = it.next();
            if(country.startsWith("A")){
                it.remove();
            }
        }
        System.out.println(countries);
    }
}
