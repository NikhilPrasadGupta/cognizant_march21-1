package inheritance;

public class Cat extends Animal{
	
	public Cat() {
		super();
	}
	public Cat(String name) {
		super(name);		
	}

	void bite() {
		System.out.println(getName()+" is biting");
	}

}
