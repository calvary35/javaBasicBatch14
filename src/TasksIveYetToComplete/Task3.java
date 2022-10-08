package TasksIveYetToComplete;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not./

    void printPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder kevin = new StringBuilder(str);
        kevin.reverse();
        if (kevin.toString().equals(str)) {
            System.out.println("The string is Palindrome");
        } else {
            System.out.println("The string is not Palindrome");

        }
    }

    public static void main(String[] args) {
        Task3 task = new Task3();
        task.printPalindrome("Dad");
    }
}
