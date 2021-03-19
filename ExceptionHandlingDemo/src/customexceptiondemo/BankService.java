package customexceptiondemo;

public class BankService {
	
	int balance = 5000;
	
	void withdraw(int accNo,int amount) throws InvalidAccountNumberException, InsufficientBalanceException{
		
		if(accNo!=101) {
			throw new InvalidAccountNumberException("Your Account number is not valid");
		}
		if(amount>balance) {
			throw new InsufficientBalanceException("You Balance is not sufficient for transaction");
		}
		
		System.out.println("Opening Balance : "+balance);
		balance-=amount;
		System.out.println("Amount Withdrawn from  : "+accNo);
		System.out.println("Amount : "+amount);
		System.out.println("Available Balance : "+balance);
		
	}
	

}
