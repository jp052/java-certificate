public class ThrowableAndErrorTest {
	public static void main(String[] args) {
		ThrowableAndErrorTest test = new ThrowableAndErrorTest();
		test.catchThrowable();
		test.catchError();
	}
	
	public void catchThrowable(){
		try {
			throw new Throwable();
		} catch (Throwable t) {
			//Throwable also catches errors, that is not wanted!
			System.out.println("Throwable can be caught too, but shouldnt.");
		}
	}
	
	public void catchError(){
		try {
			throw new Error();
		} catch (Error t) {
			System.out.println("Errors can be caught too, but shouldnt.");
			//details: http://stackoverflow.com/questions/352780/when-to-catch-java-lang-error
		}
	}
	
	public void catchException() {
	
	}
	
	public void catchRuntimeException() {
	
	}

}

