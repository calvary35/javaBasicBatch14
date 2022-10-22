package replits;

public class replit140 {
    /*
    For you to do:

Create the maxLength method that will accept String array of words and return the word with the largest length.

Method should visible only within same package!

**Expected Output:**

```
this is long
     */
    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
String maxLength=maxLength(arr);
        //should print "this is long"

    }
   static String maxLength(String[] arr){
        String str="";

        for (int i=0;i< arr.length;i++){
            if(arr[i].length()<arr[i].length()){
                str=arr[i+1];
            }

        }

       return str;
   }
}



