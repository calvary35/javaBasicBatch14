package replits;
/*
Find the largest even length word from a String
if there are two words with same largest even length return the first one.
if there are not even words return -1
input ["find MaxLen Even"]
output ["MaxLen"]
input["I am very Good at Java"]
output ["very"]
input["I was"]
output ["-1"]
 */
public class replit221 {
    public static void main(String[] args) {
        System.out.println(largestEvenWord("kevin sis the man"));
    }

    public static String largestEvenWord(String str) {
        String longestEvenWord = "";
        String temp = "-1";
        boolean isTrue=false;
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {


            if (split[i].length() % 2 == 0 && split[i].length() > longestEvenWord.length()) {
                longestEvenWord = split[i];
                isTrue=true;

         //   } else if(!isTrue){
          //    longestEvenWord=temp;
            }


        }
        if(longestEvenWord.isEmpty()){
            longestEvenWord="-1";
        }
        return longestEvenWord;
    }
}
