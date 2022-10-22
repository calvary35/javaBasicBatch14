package GroupProjects;

public class task11 {
	public static void main(String[] args) {

		// Write a program to print out duplicate elements from an Array of Strings?

		String[] build = { "James", "Hello", "football", "Kevin", "Kevin" };
		
		for(int i=0;i<build.length;i++) {
			if(build[i].equals(build.length)) {
				System.out.println(build[i]);
			}
		}

	}

}
