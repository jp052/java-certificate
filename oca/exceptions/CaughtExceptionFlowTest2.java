public class CaughtExceptionFlowTest2 {
	public String name;
	public void parseName() {
		System.out.println("1 printed");
		try {
			System.out.println("2 printed");
			int x = Integer.parseInt(name); //throws NumberFormatException
			System.out.println("3 not printed");
	
		} catch (NumberFormatException e) {
			System.out.println("4 printed");
		}
	}
	
	public static void main(String[] args) {
		CaughtExceptionFlowTest2 leroy = new CaughtExceptionFlowTest2();
		leroy.name = "Leroy";
		leroy.parseName();
		System.out.println("5 printed");
	}
		
}