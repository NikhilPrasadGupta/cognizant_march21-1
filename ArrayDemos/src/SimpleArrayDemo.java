
public class SimpleArrayDemo {

	public static void main(String[] args) {
		// Array Creation
		Object [] arr = {100,"pankaj",300000.98};
		// Array Instantiation
//		arr=new int[5];
		// Array Initialization
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		// Accessing Array
		
		
		System.out.println(arr.toString());
		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
