class LabelTest {
	public static void main(String[] args) {
		LabelTest test = new LabelTest();
		test.ifWithBreakAndLableWorks();
		test.ifBreakWithoutLabelDoesNotCompile();
	}
	
	private void ifWithBreakAndLableWorks() {
		System.out.println("\n ifWithBreakAndLableWorks:");
		label: if(true) {
			System.out.println("before break");
			break label;
			//System.out.println("after break"); //DOES NOT COMPILE: error: unreachable statement
		}
	}
	
	private void ifBreakWithoutLabelDoesNotCompile() {
		System.out.println("\n ifBreakWithoutLabelDoesNotCompile:");
		if(true) {
			System.out.println("before break");
			//break; //DOES NOT COMPILE:  error: break outside switch or loop
		}
	}
	
}