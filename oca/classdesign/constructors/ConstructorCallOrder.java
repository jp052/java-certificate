public class ConstructorCallOrder {
	public static void main(String[] args) {
		//demonstriert, dass Parent constructor immer vor child constructor aufgerufen wird.
		System.out.println("create Chimpanzee");
		Chimpanzee d = new Chimpanzee();
	}
	
}

class Primate {
	public Primate() {
		System.out.println("Parent: Primate");
	}
}

class Ape extends Primate {
	public Ape() {
		System.out.println("Child: Ape");
	}
}

class Chimpanzee extends Ape {
	
}
