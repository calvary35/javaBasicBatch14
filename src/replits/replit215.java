package replits;

public class replit215 {
    public static void main(String[] args) {

        System.out.println(isBalanced("((hello))"));
    }

    static public boolean isBalanced(String s) {
        int count = 0;
        int count2=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c==')') {
                count2++;
            }
        }
        if (count==count2) {
            return true;
        } else {
            return false;
        }
    }
}