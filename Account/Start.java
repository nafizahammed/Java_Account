import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		a1.setAccountNumber(1111);
		a1.setAccountHolderName("OOP1 M");
		a1.setBalance(2000);
		
		System.out.println("Account Number: "+a1.getAccountNumber());
		System.out.println("Account Holder Name: "+a1.getAccountHolderName());
		System.out.println("Balance: "+a1.getBalance());	
		
		Account a2 = new Account(2222, "OOP1 Q", 2001);
		a2.showDetails();
		
		
	}
}