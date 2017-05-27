
public class InitializerAndConstructorLoadingTest {
	public static void main(String[] args) {
		InitializerAndConstructorLoadingTest test = new InitializerAndConstructorLoadingTest();
		
		A.load();
		
	}
	
	
}


class A1{
  static int i = 10;
  static { System.out.println("A1 Loaded "); }
  
   public A1() {
	  System.out.println("A1 Constructor Loaded ");
  }
}

class A{
	
  static { System.out.println("A Loaded "); }
  
  public A() {
	  System.out.println("A Constructor Loaded ");
  }
  
  public static void load(){
    System.out.println(" A should have been loaded");
    A1 a1 = null; //Ruft noch nicht den A1 static initializer block auf, erst wenn ein neues Objekt erzeugt wird, oder auf eine static variable zugegriffen wird.
    System.out.println(" A1 should not have been loaded");
    System.out.println(a1.i);
	
	A1 a12 = new A1();
  }
}
