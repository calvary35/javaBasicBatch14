package replits;

/*
Remove Consecutive duplicates
Write the logic to remove only consecutive duplicates
input ["aabbcde"]-> output["abcde"]
input ["aabbcc"]-> output["abc"]
input ["aabbcca"]-> output["abca"]
input ["aabbccaddda"]-> output["abcada"]
 */
public class replit224 {

    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("aacddeffkllmmmnnopqqqqrrttttvv"));
    }

    public static String removeConsecutiveDuplicates(String input) {



        StringBuilder sb = new StringBuilder("");
        int length = input.length();
        int i = 0;

        while (i < length)
        {
            char c = input.charAt(i);
            sb.append( c );
            while (i<length && input.charAt(i)==c)
                ++i;
        }
        return sb.toString();
     /*   for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i - 1) == input.charAt(i)) {
                sb.append(input.charAt(i));
            }
        }*/




    }
}

