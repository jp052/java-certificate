public class CaughtExceptionFlowTest {
	public static void main(String... args) {
		new CaughtExceptionFlowTest().go();
		System.out.println("G reached");
	}
	
	//shows the control flow of a caught exceptions.
	//only the code in the method that threw the exception is not executed (F).
	//Everything else is executed.
	public void go()  {
		System.out.println("A reached");
		try {
			stop();
		} catch (NullPointerException e) {		
			System.out.println("B reached");
			e.printStackTrace();
		} finally {
			System.out.println("C reached");
		}
		System.out.println("D reached");
	}
	
	public void stop() {
		System.out.println("E reached");
		Object x = null;
		x.toString();
		System.out.println("F not reached");
	}
}

