
public class IfElseDemo {

	public static void main(String[] args) {
		
		int testScore=70;
		
		char grade = 0;

		if(testScore>=90) {
			grade='A';
			System.out.println("You Got : "+grade +" Grade");
		} else if(testScore>=80 && testScore<=89) {
			grade='B';
			System.out.println("You Got : "+grade +" Grade");
		}
		else {
			System.out.println("You are fail! Try Again");
		}
		
	}

}
