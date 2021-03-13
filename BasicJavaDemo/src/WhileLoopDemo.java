import java.util.Scanner;

/**
 * Desc :  Show the welcome message on screen unless user say no
 * @author panka
 *
 */
public class WhileLoopDemo {

	public static void main(String[] args) {
		String response ="yes";
		Scanner sc =  new Scanner(System.in);
		while(response.equals("yes")) {
			System.out.println("Welcome");
			System.out.println("Give your response : ");
			response = sc.next();
			
		}

	}

}
