package replits;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class replit222 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(5);
        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        int largestNum = 0;
        int number = 0;
        int result = 0;

            Iterator<Integer>it = list.iterator();
            while (it.hasNext()){
                Integer val = it.next();
               if(val>number&& val>largestNum){
                    number=largestNum;
                    largestNum=val;

                }

                result = largestNum + number;
            }


        return result;
    }
}
