package replits;

import java.util.ArrayList;
import java.util.List;

public class replit218 {
    /*
    Count the number of repetations of words in an ArrayList append that count and return that list.
You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]

output [switch, tv, switch1, tv1, switch2, tv2]

In this example as word switch is repeated we pick the next entry
where it is repeated and append the count i.e how many times that
word was present previously

More Exmaples
input ["switch","tv","switch","tv","switch","tv","radio"]
output [switch, tv, switch1, tv1, switch2, tv2, radio]
input ["switch","tv","switch","tv"]
output [switch, tv, switch1, tv1]
if words are not repeated we get the same output
input ["switch","tv"]
output [switch, tv]
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("switch");
        names.add("plus");
        names.add("tv");
        names.add("plus");
        names.add("switch");
        names.add("tv");
        names.add("switch");
        System.out.println(countDeviceNames(names));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        int count = 0;
        String str = "";

        for (int i = 0; i < deviceNames.size(); i++) {

            count = 0;
            for (int j = i + 1; j < deviceNames.size(); j++) {
                if (deviceNames.get(i).equals(deviceNames.get(j))) {
                    count++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(count);
                    str = deviceNames.get(j) + sb;
                    deviceNames.set(j, str);
                }
            }
        }

        return deviceNames;
    }
}