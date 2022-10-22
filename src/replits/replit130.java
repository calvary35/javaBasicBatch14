package replits;

public class replit130 {

        public static void main(String[] args) {
            int[] a = {1,2,3,4,5};
            mystery(a);
            // should print out 10 1 30 2 50
        }

        static void mystery(int[] array)	{
            int num=0;
            for(int i=0; i<array.length;i++){
                if(array[i]%2==0){
                    num= array[i]/2;
                }
                if(array[i]%2!=0){
                    num=array[i]*10;
                }
                System.out.print(num+" ");
            }



        }
}
