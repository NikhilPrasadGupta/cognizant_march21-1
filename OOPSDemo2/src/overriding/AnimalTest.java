package overriding;

import javax.swing.JOptionPane;


public class AnimalTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String className = JOptionPane.showInputDialog("Enter Class Name : ");
		Class c = Class.forName("overriding."+className);
		Animal animal = (Animal)c.newInstance();
		animal.eat();

	}

}
