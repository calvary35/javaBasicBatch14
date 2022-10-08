package ReviewClasses.reviewClass4;

import java.util.Arrays;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		String[]dresses=new String[] {"Pink Dress", "Cocktail", "Summer Dress", "Night Gown", "Pencil Dress"};
		//last index is always size-1
		//index start from zero
		System.out.println(dresses.length);
		
		//Mostly this is how you will be using arrays
		for(int i=0;i<dresses.length;i++) {
			System.out.println("Lets try " + dresses[i]);
		}
		System.out.println();
		for(String dress:dresses) {//this is the enhanced For Loop- really cool
			System.out.println(dress);

	}
		System.out.println();
		// prints all the elements of an array without a Loop
		System.out.println(Arrays.toString(dresses));

}
}
