import java.util.List;
import java.util.ArrayList;

public class AutoboxingAndWrapper {
	public static void main(String[] args) {
		AutoboxingAndWrapper box = new AutoboxingAndWrapper();
		box.typeConversionExamples();
		box.autoboxDouble();
		box.autoboxIntergerSpecialCase();
	}
	
	private void typeConversionExamples() {
		boolean booleanPrimitive = Boolean.parseBoolean("TRUE");
		Boolean booleanWrapper = Boolean.valueOf("true");
		
		long longPrimitive = Long.parseLong("1");
		Long longWrapper = Long.valueOf("2");
		
		//Das funktioniert für alle anderen Wrapper gleich, außer Character.
	}
	
	private void autoboxDouble() {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);
		weights.add(new Double(60.3));
		System.out.println(weights);
		
		weights.remove(60.3);
		double first = weights.get(0);
		System.out.println(weights);
		
	}
	
	private void autoboxIntergerSpecialCase() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);  //vorsicht! da es eine remove methode für int gibt, um den index zu löschen, funktioniert kein autoboxing für den Wert, wie z.B bei double.
		System.out.println(numbers); //output; [1] nicht wie erwartet [2]
		
	}
	
}