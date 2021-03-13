import java.util.Scanner;

/**
 * Display the table of given number;
 * @author panka
 *
 */
public class ForDemo {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number to generate table : ");
		int num = sc.nextInt();
		System.out.println("Below is the table of : "+num);
		for(int i=1; i<=10; i+=2) {
			System.out.println(num+" * "+i+"="+(num*i));
		}

	}

}
