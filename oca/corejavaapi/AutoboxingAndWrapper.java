import java.util.List;
import java.util.ArrayList;

public class AutoboxingAndWrapper {
	public static void main(String[] args) {
		AutoboxingAndWrapper box = new AutoboxingAndWrapper();
		box.typeConversionExamples();
		box.autoboxDouble();
		box.autoboxIntergerSpecialCase();
		box.wrapperCalculation();
	}
	
	private void typeConversionExamples() {
		System.out.println("\n typeConversionExamples:");
		boolean booleanPrimitive = Boolean.parseBoolean("TRUE");
		System.out.println("booleanPrimitive:" + booleanPrimitive);
		
		Boolean booleanWrapper = Boolean.valueOf("true"); 
		System.out.println("booleanWrapper:" + booleanWrapper);
		
		Boolean booleanWrapperNoCase = Boolean.valueOf("tRue"); //case ist egal.
		System.out.println("booleanWrapperNoCase:" + booleanWrapperNoCase);
	
		Boolean booleanWrapperNoSpace = Boolean.valueOf(" true"); //Returns false, wegen space.
		System.out.println("booleanWrapperNoSpace:" + booleanWrapperNoSpace);

		
		long longPrimitive = Long.parseLong("1");
		Long longWrapper = Long.valueOf("2");
		
		//Das funktioniert für alle anderen Wrapper gleich, außer Character.
	}
	
	private void autoboxDouble() {
		System.out.println("\n autoboxDouble:");
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);
		weights.add(new Double(60.3));
		System.out.println(weights);
		
		weights.remove(60.3);
		double first = weights.get(0);
		System.out.println(weights);
		
	}
	
	private void autoboxIntergerSpecialCase() {
		System.out.println("\n autoboxIntergerSpecialCase:");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);  //vorsicht! da es eine remove methode für int gibt, um den index zu löschen, funktioniert kein autoboxing für den Wert, wie z.B bei double.
		System.out.println(numbers); //output; [1] nicht wie erwartet [2]
		
	}
	
	private void wrapperCalculation() {
		System.out.println("\n wrapperCalculation:");
		Integer integer = new Integer(5);
		Integer integer2 = new Integer(10);
		Double doubleWrap = new Double(5.5);
		
		//im println findet autoboxing statt.
		System.out.println(integer +  integer2); 
		System.out.println(integer +  doubleWrap); 
		System.out.println(integer *  doubleWrap);
	}
	
}