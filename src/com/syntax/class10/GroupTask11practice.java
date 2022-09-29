package com.syntax.class10;

public class GroupTask11practice {

	public static void main(String[] args) {
		  // Write a program to print out duplicate elements from an Array of Strings?
        // Fixed size array the one that we know the elements:

        String[] values = { "Element", "Alone", "Element", "Java", "Alone", "People", "Jobs", "People" };

        int count = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = i+1; j < values.length; j++) {
                if (values[i].equals(values[j])) {
                    System.out.print(values[i] + " ");
                    count = count + 1;
                }
            }
        }
        //When only one word repeats
        if (count == 1) {
            System.out.print("is the repeating word in your list.");
        //More than one words repeat
        } else if (count > 1) {
            System.out.print("are the repeating words in your list.");
        //When there is no repeating words
        } else {
            System.out.println("There is no repeating word in your list.");
        }
        System.out.println();
        System.out.println("--------------------------");
    }



	}


