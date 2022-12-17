package replits;

public class replit225 {
    public static void main(String[] args) {
        int j = 443783359;
        System.out.println(reverseInteger(j));
    }

    public static int reverseInteger(int N) {
        int reverse = 0;

        while (N != 0) {
            int remainder = N % 10;
            N = N / 10;

            reverse = reverse * 10 + remainder;


        }
        return reverse;
    }

}


