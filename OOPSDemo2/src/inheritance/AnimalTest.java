package inheritance;

import javax.swing.JOptionPane;

public class AnimalTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Animal animal; // Rule 1 :  Compiler rule : Reference type methods will be called
//		animal=new Dog(); // Rule 2 : JVM Rule :  Object type of methods will be called at run time, Your method call will be redirected to object type. 
//		
//		animal.eat();
//		animal.run();
		//((Dog) animal).bark(); // Down casting : there is a chance of data loss. If this casting is forced between classes having no IS-A relationship. This will throw ClassCastException
		
//		Dog dog = new Dog();
//		
//		dog.eat();
//		dog.run();
//		dog.bark();
		
//		Animal animal = new Cat("Pussi");
//		animal.eat();
//		animal.run();
		
		String className = JOptionPane.showInputDialog("Enter Class Name : ");
		Class c = Class.forName("inheritance."+className);
		Animal animal = (Animal)c.newInstance();
		if(animal instanceof Dog) {
			animal.setName("Tommy");
			animal.eat();
			animal.run();
			((Dog) animal).bark();
		}
		if(animal instanceof Cat) {
			animal.setName("Pussi");
			animal.eat();
			animal.run();
			((Cat) animal).bite();
			
		}
		
		
	}

}
