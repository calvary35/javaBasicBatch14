package ReviewClasses.ReviewClass11;

import java.util.HashMap;
import java.util.Map;

public class InterviewQ {

    //Create a method that returns a map of characters and their count in a string
    public static void main(String[] args) {

        String str = "fbkfvdfvbdv xcvm zddjfvk";


        System.out.println(getCount(str));


    }
    public static  Map<Character,Integer> getCount(String str){

       char[]charArray =str.toCharArray();
       Map<Character,Integer> map=new HashMap<>();

        for(char c: charArray){
            if (map.get(c)==null){
                map.put(c,1);
            }else {
                int count=map.get(c);
                count+=1;
                map.put(c,count);
            }
        }
        return map;
    }

}
