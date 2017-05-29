public class ClassCastTest {

     public static void main(String []args){
        Car car = new Car();
		Ford ford = new Ford();
		car = ford; //Referenz einer Superklassen kann ohne cast als Refernz zu einer Subklasse verwendet werden
		
		Ford castedFord = (Ford) car;
        //Ford ford = (Ford) new Car(); // Class Cast Exception
		
		callWithParent(car);
		callSubClass(ford);
		callSubClass(castedFord);
		
		new Car().drive();
     }
     
     public static void callWithParent(Car car) {
         System.out.println("\n In callWithParent");
     }
     
     public static void callSubClass(Ford ford) {
         System.out.println("\n In callSubClass");
     }
}

class Car {
	public static void drive() {
		System.out.println("\n In drive");
	}
}

class Ford extends Car {
}
