package reviewClass4;

public class Array2DDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] individualsInRoom1 = new String[] {"sabej", "shah", "Mina"};
String[] individualsInRoom2 = new String[] {"roman", "Mina"};
String[] individualsInRoom3 = new String[] {"asad", "priyasri", "ali"};
//a 2d Array that will store 3 single 1d arrays
String[][] rooms = new String[3][];

rooms[0]=individualsInRoom1;
rooms[1]=individualsInRoom2;
rooms[2]=individualsInRoom3;

System.out.println(rooms[2][2]);

	}

}
