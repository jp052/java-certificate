public class PrecedenceAndAssignmentTest {
	public static void main(String args[]) {
		
	}
	
	/*
	compiliert nicht, da zuweisungen zuletzt ausgeführt werden.
	b2 != b1 = !b2 wird im erste Schritt: false = !b2.
	false kann kein Wert zugewiesen werden, da es keine Variable ist.
	Zuweisungsoperatoren haben die niedrigste Präzedenz, daher werden sie zuletzt ausgeführt.
	*/
	private void assignmentInIfWrong() {
		boolean b1 = false;
		boolean b2 = false;
		/*if(b2 != b1 = !b2) { // DOES NOT COMPILE: error: unexpected type , required: variable, found: value
			System.out.println("true");
		} else{
			System.out.println("false");
		}*/
	}
	
	private void assignmentInIfWorks() {
		boolean b1 = false;
		boolean b2 = false;
		if (b2 = b1 != b2){
		   System.out.println("true");
		}
		else{
		   System.out.println("false");
		}
	}
}