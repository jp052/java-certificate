public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilderTest sbt = new StringBuilderTest();
		sbt.lenghtTest();
	}
	
	private static void lenghtTest() {
		StringBuilder sb = new StringBuilder("12345678");
		sb.setLength(5);
		System.out.println("start<"+ sb.toString() + ">end");
		sb.setLength(10);
		System.out.println("start<"+ sb.toString() + ">end"); //output mit 5 Leerzeichen
	}
}