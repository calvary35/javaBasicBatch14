package replits;

public class replit226 {
    public static void main(String[] args) {

      /*  Reverse the String without using the Reverse method from the BtringBuilder Class
        input["I am a java Programmer"] output["Programmer java a am I"]

        input["Syntax is Great"] output["Great is Syntax"]*/


        System.out.println(reverse("I am a java Programmer"));
        System.out.println(reverse("Syntax is Great"));
    }
    public static String reverse(String strToRev){
        String str="";
        String[] splitString= strToRev.split(" ");


        for (int i = splitString.length-1; i >= 0; i--) {

            String s=splitString[i];
            if(i!=0){
            str = str+" "+s;}
            else{
                str=str.trim()+" "+s;

            }



        }
        return str.trim();

    }
    }

