package encapsulation;

public class TestDog {

	public static void main(String[] args) {
		Dog dog1 = null; // Reference Creation
		dog1 = new Dog(); // Object Creation
		dog1.setName("Tommy");
		dog1.setAge(-5);
		dog1.eat();
		dog1.run();
		

	}

}
