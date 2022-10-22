package replits;

public class replit151 extends calcSum {
    public static void main(String[] args) {


        int[][] a = {

                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}

        };

        sum2D(a);
    }
}






class calcSum {

    static int sum2D(int[][]arr) {
        int total = 0;

        int[][] a = new int[][]{};
        for (int[] calc : a) {
            total=0;
            for (int value : calc) {
                total += value;


            }
            return total;

        }

        return total;
    }
}



