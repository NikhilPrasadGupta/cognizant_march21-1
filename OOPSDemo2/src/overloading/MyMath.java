package overloading;

public class MyMath {

	void add(int num1, int num2) {
		System.out.println("-------add(int num1, int num2)---------");
		System.out.println("Addition is : "+(num1+num2));
	}
	void add(int num1, float num2) {
		System.out.println("-------add(int num1, float num2)---------");
		System.out.println("Addition is : "+(num1+num2));
	}
	void add(float num1, int num2) {
		System.out.println("-------add(float num1, int num2)---------");
		System.out.println("Addition is : "+(num1+num2));
	}
	void add(float num1, float num2) {
		System.out.println("-------add(float num1, float num2)---------");
		System.out.println("Addition is : "+(num1+num2));
	}
}
