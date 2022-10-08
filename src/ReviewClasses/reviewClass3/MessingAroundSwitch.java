package ReviewClasses.reviewClass3;

import java.util.Scanner;

public class MessingAroundSwitch {

	public static void main(String[] args) {
		
		System.out.println("Please enter your favorite soccer team");
		
		Scanner scan = new Scanner(System.in);
		
		String team = scan.next();
		
		String league;
		
		switch(team) {
		
		case "Tottenham":
			league = "Premier League";
			break;
		case "Barcelona":
			league = "La Liga";
			break;
		case "PSG":
			league = "Ligue 1";
		break;
		case  "Bayern Munich":
			league = "Bundesliga";
			break;
		case "Juventus":
			league = "Seria A";
			break;
		default:
			league = "Your team must not be well known or you're an Arsenal fan(in which no one cares about you)";
			break;
			
		}
		System.out.println(league);
	}

}
