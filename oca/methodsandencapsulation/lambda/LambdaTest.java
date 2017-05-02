import java.util.*;
import java.util.function.*;

/*
How to discover invalid lambda syntax:
There is a simple trick to identify invalid lambda constructs. When you write a lambda expression for a functional interface, you are essentially providing an implementation 
of the method declared in that interface but in a very concise manner.  Therefore, the lambda expression code that you write must contain all the pieces of the regular method 
code except the ones that the compiler can easily figure out on its own such as the parameter types, return keyword, and brackets. So, in a lambda expression, just check that 
all the information is there and that the expression follows the basic syntax - 

(parameter list) OR single_variable_without_type -> { regular lines of code } OR just_an_expression_without_semicolon

For a complete discussion on this topic please see this short tutorial - http://enthuware.com/index.php/home/115
*/
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

