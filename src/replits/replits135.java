package replits;

public class replits135 {
    static String surround(String s, String search_term){
        /*
        Return a new String built from s that has every instance of the search term surrounded by parentheses
See below examples.
         */
        String newString = s.replaceAll(search_term, ("("+search_term+")"));
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(surround("abcabcabc","c"));
        System.out.println(surround("technology","o"));
    }
}
