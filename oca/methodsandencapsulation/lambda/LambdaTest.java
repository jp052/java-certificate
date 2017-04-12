import java.util.*;
import java.util.function.*;

public class LambdaTest {
	public static void main(String[] args) {
		PredicateSearch.run();
		useJavaIntegratedPredicates();
	}
	
	private static void useJavaIntegratedPredicates() {
		System.out.println("\n useJavaIntegratedPredicates:");
		
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies);
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);
	}
}


/**
*	Verwendung von Predicates und Lambda, das Gegenstück liegt in LambdaCompareTest.TraditionalSearch
**/
class PredicateSearch {
	public static void run() {
		System.out.println("\n PredicateSearch.run()");
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("bear", true, false));
		
		print(animals, a -> a.canHop());
	}
	
	/**
	* Predicate ist eine von Java zur verfügung gestelltes functional interface mit einem Parameter. 
	**/
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for(Animal animal : animals) {
			if(checker.test(animal)) {
				System.out.println(animal + " ");
			}
		}
		System.out.println();
	}
}

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	public boolean canHop() {
		return canHop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}	
	
	public String toString() {
		return species;
	}
}

