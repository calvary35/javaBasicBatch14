package replits;

public class replit168 {



       static final String reverse(String str) {

            String s = "";
            for (int i = str.length() - 1; i >= 0; i--) {

                s = s + str.charAt(i);

            }
            return s;
        }

        public static void main(String[] args) {

            System.out.println(replit168.reverse("hello"));
        }
    }

  /*
    static final String reverse(String str){

        String s="";
        for(int i=str.length()-1;i>=0;i--){

           s=s+str.charAt(i);

        }
        return s;
    }
        public static void main(String[]args){
            System.out.println(reverse("hello"));
        }
    }
*/
