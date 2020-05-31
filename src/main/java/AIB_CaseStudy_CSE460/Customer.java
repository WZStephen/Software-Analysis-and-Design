package AIB_CaseStudy_CSE460;

import java.util.ArrayList;
import java.util.Scanner;
public class Customer
{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	public int custID;

	public Customer(String firstName, String lastName, String phoneNumber)
	{
      this.firstName = firstName;
      this.lastName = lastName;
      this.phoneNumber = phoneNumber;
      custID = 1000 + (int)(Math.random() * 9999);
      System.out.println("Your cutomer id is : " + custID);

	}


   public void depositMoney()
   {
	   System.out.println("Money Deposited");
       Scanner scan = new Scanner(System.in);

	   System.out.println("Account No?: ");
	   int an = scan.nextInt();

	   System.out.println("Deposit Ammount: ");
	   double amount = scan.nextDouble();
	   BankTransaction.depositMoney(amount, an, custID);

	   // read the account number
	   // Call the bankTransaction class with account number, amount, customerID


   }

   public void withDrawMoney()
   {
	   // read the account number
	   // Call the bankTransaction class with account number, amount, customerID
	   Scanner scan = new Scanner(System.in);

	   System.out.println("Account No?: ");
	   int an = scan.nextInt();

	   System.out.println("Withdraw Ammount: ");
	   double amount = scan.nextDouble();
	   BankTransaction.withDrawMoney(amount, an, custID);

   }

    public void TransferMoney()
      {
   	     // read the account number
	      // Call the bankTransaction class with to and from account numbers, amount, customerID
	      Scanner scan = new Scanner(System.in);

		   System.out.println("From Account No?: ");
		   int fan = scan.nextInt();

		   System.out.println("To Account No?: ");
		   int tan = scan.nextInt();

		   System.out.println("Transfer Ammount: ");
		   double amount = scan.nextDouble();

	       BankTransaction.TransferMoney(amount, fan,tan,custID);
      }

    public String toString()
    {
		return firstName;
	}
}