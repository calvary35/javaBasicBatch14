package replits;

import java.util.Iterator;
import java.util.LinkedList;

public class replit190 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();

        int previous=0;
        int currentNumber=1;
        int nextNum=0;

        for(int i=0; i<8;i++) {
            nextNum=previous+currentNumber;
            previous=currentNumber;
            currentNumber=nextNum;
            num.add(previous);
            num.add(currentNumber);
            num.add(nextNum);
        }
        Iterator<Integer> it = num.iterator();
        while(it.hasNext()){
            System.out.print(nextNum +" ");
            System.out.println(currentNumber+" ");
        }
    }
}
