import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		String response;
		Scanner sc =  new Scanner(System.in);
		
		do {
			System.out.println("welcome");
			System.out.println("Give your response (yes/no) : ");
			response = sc.next();
		}while(response.equals("yes"));
		

	}

}
