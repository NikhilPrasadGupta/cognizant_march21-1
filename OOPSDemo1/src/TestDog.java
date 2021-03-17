
public class TestDog {

	public static void main(String[] args) {
		Dog dog1 = null; // Reference Creation
		dog1 = new Dog(); // Object Creation
		dog1.name="Tommy";
		dog1.age = 5;
		dog1.eat();
		dog1.run();
		
		Dog dog2 = null; // Reference Creation
		dog2 = new Dog(); // Object Creation
		dog2.name="Gabbar";
		dog2.age = 15;
		dog2.eat();
		dog2.run();

	}

}
