package replits;

import java.util.ArrayList;
import java.util.Iterator;

public class replit191 {



        public static void main(String[]args){
            ArrayList<Boolean> listA = new ArrayList<>();
            listA.add(true);
            listA.add(false);
            listA.add(false);

            ArrayList<Boolean> listB  = new ArrayList<>();
            for(int i = 0; i<listA.size();i++){
                listB.add(listA.get(i));
            }

            Iterator<Boolean> it = listB.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

        }

}
