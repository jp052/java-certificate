
public class DeclarationInitalizationVariablesTest {
	public static void main(String[] args) {
		int i, j, k; 
		//System.out.println("before: " + i + " " + j + " " + k) ; DOES NOT COMPILE. Variables not initialized.
		
		i = j = k = 9;
		
		System.out.println("after: " + i + " " + j + " " + k) ; //Prints 9 9 9. Es wird von rechts nach links initialisiert.
		
		//declaration:
		String myString;
		int number;
		
		//initialization:
		myString = "string";
		number = 1;
		
		//instanziation
		new Object();
	}
	
	
}

