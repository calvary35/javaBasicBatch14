package replits;

public class replit131 {

        static String thirdLetter(String s){


            String store="";
            for(int i=0; i<s.length();i++){
             store+=s.charAt(i);
             i++;

            }

            return store;
        }


        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(thirdLetter("hello there")); //"hltr"
            System.out.println(thirdLetter("technology")); //"thly"
        }
    }

