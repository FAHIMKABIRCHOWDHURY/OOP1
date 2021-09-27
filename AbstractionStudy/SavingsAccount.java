import java.lang.*;

public class SavingsAccount extends Account
{
	
	private double interestRate;
	
	public SavingsAccount()
	{
		super();
		System.out.println("SA-E");
	}
	public SavingsAccount(int accountNumber, double balance, double interestRate)
	{
		super(accountNumber, balance);
		System.out.println("SA-P");	
		this.interestRate = interestRate;
	}
	
	
	public void setInterestRate(double interestRate){this.interestRate = interestRate;}
	
	
	public double getInterestRate(){return interestRate;}
	
	public void showDetails()
	{
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+ balance);
		System.out.println("Interest Rate: "+ interestRate);
	}
}