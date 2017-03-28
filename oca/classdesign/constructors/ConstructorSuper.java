/*

*/

public class ConstructorSuper {
	public static void main(String... args) {
		System.out.println("create child");
		//Child c = new Child(); funktioniert nicht
		Child2 c2 = new Child2(); //funktioniert, da parent defaul constructor hat.
		ChildWithConstructor cWihtConstructor = new ChildWithConstructor();
		
	}
}

class Parent {
	public Parent(int i) {
		System.out.println("Parent(int i)");
	}
}

class ParentWithDefault {
	public ParentWithDefault() {
		System.out.println("ParentWithDefault()");
	}
	
	public ParentWithDefault(int i) { //never called
		System.out.println("ParentWithDefault(int i)"); 
	}
}

/*
Kompiliert nicht, da der Parent konstruktor nie aufgerufen wird. Automatisch wird nur der
no-argument constructor aufgerufen, fehlt der, muss super() mit parameter aufgerufen werden.

class Child extends Parent {
	
}*/

class Child2 extends ParentWithDefault {
	public Child2() {
		//super() wird hier automatisch eingefügt. Dieser Konstruktor kann auch weg gelassen werden.
		System.out.println("Child2() ohne super");
	}
}

class ChildWithConstructor extends Parent {
	public ChildWithConstructor() {
		super(1);
		System.out.println("ChildWithConstructor()");
	}
}

