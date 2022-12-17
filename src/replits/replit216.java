package replits;
/*
Create an Array of size N whose elements sum to zero
ArraySumToZero(0) ->{}
ArraySumToZero(1) ->{0}
ArraySumToZero(2) ->{-1,1}
ArraySumToZero(3) ->{1,-1,0}
ArraySumToZero(4) ->{2,-2,3,-3}
N will be given as input to the function and fucntion will return
an array whose element will sum to zero.
 */
public class replit216 {


    public static void main(String[] args) {
        arraySumToZero(0);
        arraySumToZero(1);
        arraySumToZero(2);
        arraySumToZero(3);
        arraySumToZero(4);
    }


    public static int[] arraySumToZero(int N) {
        int array[] = new int[N];

        for (int i = 0; i < array.length; i++) {

            int a = array[i];

            int b = array[a] * -1;

            array[a]+=array[b];


        }
        return array;
    }
}

