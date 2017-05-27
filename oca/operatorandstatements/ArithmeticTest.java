public cladd ArithmeticTest() {
	
	public static void main(String[] args) {
		ArithmeticTest test = ArithmeticTest();
		test.byteCalculation();
		test.decalarationAndInitializationWithCalculation();
	}
	
	private void byteCalculation() {
		byte b = -128;
         b--; //ergibt b = 127. Da es ein Overflow gibt und somit das vorzeichen gewechselt wird. -- dekrement erkennt den Verlust nicht.
         i--; //ergibt b= 126
		
		byte b2 = -128;
		//b2 = b2 -1; //DOES NOT COMPILE: possible lossy conversion from int to byte. (Der Verlust wird so erkannt. Dekrement verhält sich also nicht immer gleich.)
		 
	}
	
	private void decalarationAndInitializationWithCalculation() {
		int a = 10;
		int b = 20;
		a += (a = 4);
		b = b + (b = 5); //Es wird zuerst der initale Wert 20 verwendet und danach erst 5 initialisiert. -> 20 + (b = 5) -> 20 + 5 -> 25
		System.out.println(a+ ",  "+b); //Output 14, 25
		
	}
}