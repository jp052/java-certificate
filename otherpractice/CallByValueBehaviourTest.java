
public class CallByValueBehaviourTest {
	public static void main(String[] args) {
		Reference originalObjectReference = new Reference();
		TestClass testClass = new TestClass();
		
		System.out.println("original name before modification: " + originalObjectReference.getName());
		
		testClass.reassignReference(originalObjectReference);
		System.out.println("name after reference reassign (does not change): " + originalObjectReference.getName());
		
		testClass.modifyReference(originalObjectReference);
		System.out.println("name after modification (changed): " + originalObjectReference.getName());
		
	}
}

class TestClass {
	public void modifyReference(Reference copyOfPassedReference) {
		//copyOfPassedReference hat eine neue Referenz die auf das in originalObjectReference angelegte Objekt zeigt.
		//Aus diesem Grund kann das Objekt über setter und andere Methoden hier modifiziert werden.
		//copyOfPassedReference ------>(zeigt auf) Reference Object das in der main methode angelegt wurde.
		copyOfPassedReference.setName("modified name"); 
	}
	
	public void reassignReference(Reference copyOfPassedReference) {	
		copyOfPassedReference = new Reference();
		copyOfPassedReference.setName("crazy new naaame");
		//hier wird der übergebenen referenz ein neues Objekt übergeben, daher werden die Änderungen in der 
		//Klasse CallByValueBehaviourTest nicht mehr gesehen.
	}
}

class Reference {
	private String name = "original name";
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
