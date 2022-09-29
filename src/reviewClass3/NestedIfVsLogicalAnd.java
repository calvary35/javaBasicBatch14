package reviewClass3;

public class NestedIfVsLogicalAnd {

	public static void main(String[] args) {

		boolean programmer = true;
		boolean manualTester = true;
		boolean knowFramework = false;

		if (programmer) {
			if (manualTester) {
				if (knowFramework) {
					System.out.println("You can be an automation engineer");
				} else {
					System.out.println("You need to know a framework");
				}
			} else {
				System.out.println("You need to know Manual Testing as well");
			}
		} else {
			System.out.println("You need to know programming as well");
		}
	}

}