/**
* Alle Klassen sind für Übungszwecke in einer Datei, damit alles aufeinen Blick gesehen werden kann.
**/

import java.util.*;

public class LambdaCompareTest {
	public static void main(String[] args) {	
		TraditionalSearch.run();
	}
}

/**
* Verwendung von einer normalen suche ohne lambda und lambda mit einem eigenen Interface, das gegenstück liegt in LambdaCompareTest.TraditionalSearch
* Problem: Ohne Lambdas müssen für jeden check muss eine neue Klasse von CheckTrait erstellt werden und ein neues print statement hinzugefügt werden.
**/
class TraditionalSearch {
	public static void run() {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		
		//ohne lambda
		System.out.println("All hoppers: ");
		print(animals, new CheckIfHopper());
		System.out.println("All swimmers: ");
		print(animals, new CheckIfSwimmer());  
		
		//mit lambda (minimale syntax)
		System.out.println("All hoppers with Lambda: ");
		print(animals, a -> a.canHop()); //die lambda expression wird automatisch der Interface CheckTrait.test() Methode mit boolean return Wert zugeordnet. (normal würde man ein Predicate verwenden)
		
		//mit voller lambda Syntax
		print(animals, (Animal a) -> {return a.canHop();});
		//(Animal a) = einzelner Parameter mit dem Name a. Klammer kann nur weg gelassen werden, wenn es einzelner Parameter ohne Typangabe ist. Bei keinem oder mehrern Parameter muss die Klammer angegeben werden.
		//-> = Pfeiloperator um Paramter und Body zu separieren (sonst hat der Pfeil keine Bedeutung!)
		//{return a.canHop();} = Body mit einem Methodenaufruf und return. Klammer, return und semicolon können nur bei einem einzelnen Statement weg gelassen werden.
	}
	
	private static void print(List<Animal> animals, CheckTrait checker) {
		for(Animal animal : animals) {
			if(checker.test(animal)) {
				System.out.println(animal + " ");
			}
		}
		System.out.println();
	}
}

//Trait = Merkmal
interface CheckTrait {
	boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}

class CheckIfSwimmer implements CheckTrait {
	public boolean test(Animal a) {
		return a.canSwim();
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