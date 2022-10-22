package replits;

public class replit139 {

        public static void main(String[]args){
            System.out.println(alphabetical("hello"));

        }

        public static String alphabetical (String str){
            String newLine="";
            newLine=newLine+str.charAt(0);
            for(int i=1;i<str.length();i++){
                if(str.charAt(i)>str.charAt(i-1)){
                    newLine=newLine + str.charAt(i);

                }
            }
            return newLine;
        }

    }

