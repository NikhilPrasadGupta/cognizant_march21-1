
public class ExpDemo1 {

	public static void main(String[] args) {
		System.out.println("---------First Line----------");
		int a=10,b=0;
		try {
			int c=a/b;
			System.out.println("Result : "+c);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("---------Last Line-----------");

	}

}
