package markerinterfacedemo;

public class TestEmployee {

	public static void main(String[] args) {
		Employee [] employees = {
				new Programmer("Rahul"),
				new Programmer("Likhita"),
				new Tester("Sravani"),
				new Programmer("Akash"),
				new Tester("Gourab")
		};
		
		for (Employee employee : employees) {
			if(employee instanceof Expert) {
				employee.doSomething();
			}
			
		}

	}

}
