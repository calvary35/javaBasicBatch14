package replits;

import java.util.ArrayList;

public class replit220arrayList {
    public static void main(String[] args) {
        System.out.println(formatString("5438745215"));
    }

    public static String formatString(String S) {
/*
Format the String:
Write the logic to format the string in the below given format
xxx-xxx-xxx
after each 3 digits there should be dash("-")
if there are any spaces in the input remove those
input ["00-44   48 555555"]
output ["004-448-555-555"]
input ["00-44   48 555"]
output["004-448-555"]
input ["00-44  #$% 48 55"]
output ["004-448-55"]
 */

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add(S);

        StringBuilder sb = new StringBuilder(S);
        String s = S.replaceAll(" ", "");

        for (int i = 0; i < s.length(); i += 3) {

            if (i != 0) {
                sb.insert(i, '-');
                i++;
            }
        }
        return sb.toString();
    }
}
