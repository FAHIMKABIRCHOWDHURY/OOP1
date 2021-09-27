import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountNumber(1111);
		sa1.setBalance(5000.0);
		sa1.setInterestRate(7.8);
		
		SavingsAccount sa2 = new SavingsAccount(1112, 6000.0, 8.4);
		SavingsAccount sa3 = new SavingsAccount(1113, 5500.0, 6.7);
		SavingsAccount sa4 = new SavingsAccount(1114, 6500.0, 9.2);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber(2111);
		fa1.setBalance(100000.0);
		fa1.setTenureYear(10);
		
		FixedAccount fa2 = new FixedAccount(2112, 200000.0, 5);
		FixedAccount fa3 = new FixedAccount(2113, 250000.0, 7);
		FixedAccount fa4 = new FixedAccount(2114, 120000.0, 3);
		
		Customer c1 = new Customer(11111111, "Mr. ABC", 20, "+8801711111111");
		
		System.out.println("\n--------------------------------------\n");
		
		c1.showDetails();
		System.out.println("\n*********** Customer Accounts**************\n");
		c1.showAllAccounts();
		System.out.println("\n--------------------------------------\n");
		
		
		
		if(c1.insertAccount(sa1))
		{
			System.out.println(sa1.getAccountNumber() + " Inserted for nid " + c1.getNid());
		}
		else
		{
			System.out.println(sa1.getAccountNumber() + " Not Inserted for nid " + c1.getNid());
		}
		
		if(c1.insertAccount(sa2)){System.out.println(sa2.getAccountNumber() + " Inserted");}
		else{System.out.println(sa2.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(sa3)){System.out.println(sa3.getAccountNumber() + " Inserted");}
		else{System.out.println(sa3.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(sa4)){System.out.println(sa4.getAccountNumber() + " Inserted");}
		else{System.out.println(sa4.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(fa1)){System.out.println(fa1.getAccountNumber() + " Inserted");}
		else{System.out.println(fa1.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(fa2)){System.out.println(fa2.getAccountNumber() + " Inserted");}
		else{System.out.println(fa2.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(fa3)){System.out.println(fa3.getAccountNumber() + " Inserted");}
		else{System.out.println(fa3.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(fa4)){System.out.println(fa4.getAccountNumber() + " Inserted");}
		else{System.out.println(fa4.getAccountNumber() + " Not Inserted");}
		
		System.out.println("\n--------------------------------------\n");
		
		c1.showDetails();
		System.out.println("\n*********** Customer Accounts**************\n");
		c1.showAllAccounts();
		System.out.println("\n--------------------------------------\n");
		
		
		if(c1.removeAccount(sa2)){System.out.println(sa2.getAccountNumber() + " Removed for nid " + c1.getNid());}
		else{System.out.println(sa2.getAccountNumber() + " Not Removed for nid " + c1.getNid());}
		
		if(c1.removeAccount(sa4)){System.out.println(sa4.getAccountNumber() + " Removed for nid " + c1.getNid());}
		else{System.out.println(sa4.getAccountNumber() + " Not Removed for nid " + c1.getNid());}
		
		if(c1.removeAccount(fa3)){System.out.println(fa3.getAccountNumber() + " Removed for nid " + c1.getNid());}
		else{System.out.println(fa3.getAccountNumber() + " Not Removed for nid " + c1.getNid());}
		
		System.out.println("\n--------------------------------------\n");
		
		c1.showDetails();
		System.out.println("\n*********** Customer Accounts**************\n");
		c1.showAllAccounts();
		
		
		System.out.println("\n--------------------------------------\n");
		
		Account sa = c1.searchAccount(sa4.getAccountNumber());
		if(sa != null)
		{
			System.out.println("Object Found....");
			sa.showDetails();
		}
		else
		{
			System.out.println("No Object Found with Account Number: " + sa4.getAccountNumber());
		}
		System.out.println("\n--------------------------------------\n");
		Account fa = c1.searchAccount(fa2.getAccountNumber());
		
		if(fa != null)
		{
			System.out.println("Object Found....");
			fa.showDetails();
		}
		else
		{
			System.out.println("No Object Found with Account Number: " + fa4.getAccountNumber());
		}
		
		
	}
}