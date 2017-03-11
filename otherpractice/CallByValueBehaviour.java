
public class Runner {
	public static void main(String[] args) {
		Reference reference = new Reference();
		TestClass testClass = new TestClass();
		
		System.out.println("name before modification: " + reference.getName());
		testClass.modifyReference(reference);
		System.out.println("name after modification: " + reference.getName());
		testClass.reassignReference(reference);
		System.out.println("name before reassign: " + reference.getName());
	}
}

class TestClass {
	public void modifyReference(Reference reference) {
		reference.setName("modified name");
	}
	
	public void reassignReference(Reference reference) {
		reference = new Reference();
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
