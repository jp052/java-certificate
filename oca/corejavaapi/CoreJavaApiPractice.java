public class CoreJavaApiPractice {
	
	public static void main(String args[]) {
		CoreJavaApiPractice coreJavaApiPractice = new CoreJavaApiPractice();
		coreJavaApiPractice.helloCoreJavaApiPractice();
		coreJavaApiPractice.stringEquality();
	}
	
	public void helloCoreJavaApiPractice() {
		System.out.println("Hello CoreJavaApiPractice!");
	}
	
	public void stringBuilderPractice() {
		StringBuilder sb = new StringBuilder("animal");
		
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