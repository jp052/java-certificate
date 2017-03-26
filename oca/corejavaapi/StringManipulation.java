public class StringManipulation {
	
	public static void main(String[] args) {
		StringManipulation stringManipulation = new StringManipulation();
		stringManipulation.substring();
		stringManipulation.stringEquality();
	}

	public void concat() {
		
	}
	
	public void substring() {
		String camelCase = "MeinTollerString.";
		String tollerSubstring = camelCase.substring(4, 10); //start=inklsuive, ende=exklusive. Startindex wird ausgegeben, Endindex wird nicht ausgegeben. 	
		System.out.println("substring Toller:" + tollerSubstring); //output: toller
		
		String emptySubstring = camelCase.substring(3,3);
		System.out.println("leerer substring:" + emptySubstring);
		
		String outOfBoundString = camelCase.substring(3, 18);
		//System.out.println("out of bound:" + outOfBoundString);
		
	}
	
	public void stringEquality() {
		String x = "Hello World";
		String y = "Hello World";
		System.out.println("x == y: " + (x == y)); //true, da Hello World im JVM String Pool abgelegt wird
		//Beachten: wird die Klammer um x == y weg gelassen, wird zuerst "x == y" + x als String concateniert. -> daher kommt dann false als Ergebnis
		
		String x2 = new String("Hello World2");
		String y2 = new String("Hello World2");
		System.out.println("x2 == y2: " + (x2 == y2)); //false, da explizit 2 unterschiedliche String Objekte angelegt werden.		
	}	
	
}