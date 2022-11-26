package replits;

public class replit226 {
    public static void main(String[] args) {

      /*  Reverse the String without using the Reverse method from the BtringBuilder Class
        input["I am a java Programmer"] output["Programmer java a am I"]

        input["Syntax is Great"] output["Great is Syntax"]*/


        String program = "I am a java Programmer";



        for (int i = program.length()-1; i >= 0; i--) {
            char c=program.charAt(i);
            System.out.print(c);
        }

    }
}
