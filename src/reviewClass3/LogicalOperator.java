package reviewClass3;

public class LogicalOperator {

	public static void main(String[] args) {
		
		boolean programmer = false;
		boolean manualTester=true;
		boolean knowFramework = false;
		
		if(programmer && manualTester) {
			System.out.println("You can be automation engineer");
		}else {
			System.out.println("You must know a programming language and manual testing " 
		+ "to be an automation engineer");
		}

	}

}
