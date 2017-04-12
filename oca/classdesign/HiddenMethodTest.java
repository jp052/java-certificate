
public class HiddenMethodTest {
	public static void main(String[] args) {
		Deer.run();
		
		System.out.println("\n call from outside Deer:");
		Deer deer = new Reindeer(5);
		//Es kann nicht auf deer.hasHorns() zugegriffen werden, da es innerhalt von Deer private ist. Da es hidden und nicht overriden ist, wird nicht auf die Reindeer methode zugegriffen.
		//System.out.println("," + deer.hasHorns()); //DOES NOT COMPILE: error: hasHorns() has private access in Deer
	}
	
}

class Deer {
	public Deer() {
		System.out.print("Deer");
	}
	
	public Deer(int age) {
		System.out.print("DeerAge");
	}
	
	private boolean hasHorns() {return false;}
	
	public static void run() {
		System.out.println("\n call from inside Deer:");
		Deer deer = new Reindeer(5);
		System.out.println("," + deer.hasHorns());
	}
}

class Reindeer extends Deer {
	public Reindeer(int age) {
		System.out.print("Reindeer");
	}
	
	public boolean hasHorns() { return true; }
}