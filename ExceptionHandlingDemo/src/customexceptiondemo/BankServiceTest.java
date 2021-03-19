package customexceptiondemo;

public class BankServiceTest {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		try {
			bankService.withdraw(101, 2000);
		} catch (InvalidAccountNumberException e) {
			System.out.println(e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
