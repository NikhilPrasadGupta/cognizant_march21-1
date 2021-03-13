
public class MyBio {
	private static int personId;
	private static String personName;
	private static String location;
	private static String contact;
	private static String email;
	
	public static void main(String[] args) {
		getInput(1001,"Pankaj Sharma","Indore","8827611875","t-Pankaj4@cognizant.com");
		showOutput();

	}

	private static void showOutput() {
		System.out.println("Id : "+personId);
		System.out.println("Person Name : "+personName);
		System.out.println("location : "+location);
		System.out.println("Contact : "+contact);
		System.out.println("Email : "+email);
		
	}

	private static void getInput(int id, String pName, String loc, String cont, String em) {
		personId =id;
		personName = pName;
		location = loc;
		contact = cont;
		email = em;		
		
	}

}
