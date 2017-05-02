public class StringManipulation {
	
	public static void main(String[] args) {
		StringManipulation stringManipulation = new StringManipulation();
		stringManipulation.substring();
		stringManipulation.stringEquality();
		stringManipulation.charToString();
		stringManipulation.stringEqualsWithInitialization();
	}

	public void concat() {
		
	}
	
	public void substring() {
		System.out.println("\nsubstring():");
		String camelCase = "MeinTollerString.";
		String tollerSubstring = camelCase.substring(4, 10); //start=inklsuive, ende=exklusive. Startindex wird ausgegeben, Endindex wird nicht ausgegeben. 	
		System.out.println("substring Toller:" + tollerSubstring); //output: toller
		
		String emptySubstring = camelCase.substring(3,3);
		System.out.println("leerer substring:" + emptySubstring);
		
		try {
			String outOfBoundString = camelCase.substring(3, 18);
			//System.out.println("out of bound:" + outOfBoundString);
			
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void stringEquality() {
		System.out.println("\nstringEquality():");
		String x = "Hello World";
		String y = "Hello World";
		System.out.println("x == y: " + (x == y)); //true, da Hello World im JVM String Pool abgelegt wird
		//Beachten: wird die Klammer um x == y weg gelassen, wird zuerst "x == y" + x als String concateniert. -> daher kommt dann false als Ergebnis
		
		String x2 = new String("Hello World2");
		String y2 = new String("Hello World2");
		System.out.println("x2 == y2: " + (x2 == y2)); //false, da explizit 2 unterschiedliche String Objekte angelegt werden.		
	}	
	
	public void charToString() {
		System.out.println("\ncharToString():");
		String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };
        
        String newStr = null;
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }
		
		System.out.println(newStr);
        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr))); //output: nullgood. in der ersten iteration wird null angehängt.
	}
	
	public void stringEqualsWithInitialization() {
		System.out.println("\nstringEqualsWithInitialization():");
		String str1 = "one";
		String str2 = "two";
		System.out.println( str1.equals(str1=str2) ); //First the value of 'str1' is evaluated (i.e. one). Now, before the method is called, the operands are evaluated, so str1 becomes "two". so "one".equals("two") is false.
	}
	
}