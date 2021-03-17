package inheritance;

public class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	public Dog() {
		super();
	}
	void bark() {
		System.out.println(getName()+" is barking");
	}

}
