
public class StackOverflowErrorDemo {

	public static void main(String[] args) {
		method1();

	}

	private static void method1() {
		method1();
		
	}

}
