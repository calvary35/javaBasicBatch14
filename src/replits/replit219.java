package replits;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class replit219 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("steve");
        names.add("stevens");
        names.add("danny");
        names.add("steves");
        names.add("dan");
        names.add("john");
        names.add("johny");
        names.add("joe");
        names.add("alex");
        names.add("alexander");

        List<String> query = new ArrayList<>();
        query.add("steve");
        query.add("alex");
        query.add("joe");
        query.add("john");
        query.add("dan");
        System.out.println(countOnlyPrefixes(names, query));

    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {
        List<Integer> count = new ArrayList<>();

        Integer counts = 0;
        Iterator<String> iter = query.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            counts = 0;

            Iterator<String> it = names.iterator();
            while (it.hasNext()) {

                String s = it.next();
                if (s.contains(str)) {
                    if (!s.equals(str)) {
                        counts++;
                    }

                }
            }
            count.add(counts);
        }
        return count;
    }
}