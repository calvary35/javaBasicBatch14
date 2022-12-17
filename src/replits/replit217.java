package replits;

import java.util.ArrayList;
import java.util.List;

public class replit217 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(12);
        number.add(12);
        number.add(48);
        number.add(32);
        number.add(54);
        number.add(98);
        number.add(87);
        number.add(54);
        number.add(98);
        System.out.println(countDuplicates(number));
    }

    /*
       Complete countDuplicates method This method should count how many numbers
       are appearing more than once and should return the count.
 */
    static int countDuplicates(List<Integer> numbers) {
        int count = 0;
        int previousInt = 0;
        for (int i = 0; i < numbers.size(); i++) {

            for (int j = i + 1; j < numbers.size(); j++) {

                if (numbers.get(i).equals(numbers.get(j))) {
                    if (previousInt != numbers.get(j)) {
                        previousInt = numbers.get(j);
                        count++;

                    }
                }
            }


        }
        return count;
    }
}
