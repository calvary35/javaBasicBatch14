package replits;

import java.util.ArrayList;
import java.util.Scanner;

public class replit188 {
    //Using Scanner class add 5 elements into ArrayList
    // and then print all elements from that ArrayList all in 1 line
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            number.add(scan.nextInt());

        }
        for (int i= 0; i<number.size();i++){
            System.out.println(number.get(i));
        }


    }
    }




