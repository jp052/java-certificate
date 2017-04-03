public class UncaughtExceptionFlowTest {
	public static void main(String... args) {
		new UncaughtExceptionFlowTest().go();
		System.out.println("G not reached");
	}
	
	//shows the control flow of uncaught exceptions.
	//no code after the thrown exception is executed.
	//the uncaught exception will be printed!
	public void go()  {
		System.out.println("A reached");
		try {
			stop();
		} catch (ArithmeticException e) { //does not catch the NullpointerException
			System.out.println("B Not reached");
		} finally {
			System.out.println("C reached");
		}
		System.out.println("D not reached");
	}
	
	public void stop() {
		System.out.println("E reached");
		Object x = null;
		x.toString(); //throws NullPointerException
		System.out.println("F not reached");
	}
}

