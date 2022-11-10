package replits;

import java.util.Iterator;
import java.util.LinkedList;

public class replit199 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        for(String name : names){
            System.out.println(name);
        }

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String name = it.next();
            System.out.println(name);
        }
    }
}
