package inheritance;

public class Animal {
	private String name;
	public Animal() {
		this("Unknown"); // Call diversion
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	void eat() {
		System.out.println(getName()+" is eating");
	}
	void run() {
		System.out.println(getName()+" is running");
	}
}
