
public class FirstDemo {

	public static void main(String[] args) {
		String str1= "Hello";
		String str2 = new String("Hello");
		
		System.out.println("str1 =>"+str1);
		System.out.println("str2 =>"+str2);
		
		System.out.println("str1 hashcode =>"+str1.hashCode());
		System.out.println("str2 hashcode=>"+str2.hashCode());
		
		
		if(str1==str2) {
			System.out.println("Both Strings are equal");
		}
		
		if(str1.equals(str2)) {
			System.out.println("Value in both objects are same");
		}

	}

}
