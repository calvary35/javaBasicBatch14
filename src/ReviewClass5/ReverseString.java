package ReviewClass5;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder(("I want to reverse this sentence!"));
        System.out.println(sb.reverse());

        String rev ="I want to reverse this sentence!";
String []array=rev.split("");
for(int i= array.length-1;0<=i;i--) {
    System.out.print(array[i]);
}
        System.out.println();
    char []rev2=rev.toCharArray();
for(int j=rev2.length-1;0<=j;j--){
    System.out.print(rev2[j]);
        }
    }
}
