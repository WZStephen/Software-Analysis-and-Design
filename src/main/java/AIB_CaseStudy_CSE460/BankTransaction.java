package AIB_CaseStudy_CSE460;

import java.util.ArrayList;
public class BankTransaction
{
   public static void depositMoney(double depositAmmount, int accountNO, int custID)
   {
	   // get the accountReference

	   // call deposit

	       BankAccount bref = BankUI.AIB.getAccount(accountNO);
	       if(validateCustomer(bref, custID))
	       {
              bref.deposit(depositAmmount);
              BankUI.AIB.displayAccountSummary();
	       }else
	       {
			 System.out.println("Invalid Customer");
		   }



   }

   public static void withDrawMoney(double withDrawAmmount, int accountNO, int custID)
   {
	   // get the accountReference
	   // call withdraw
	   BankAccount bref = BankUI.AIB.getAccount(accountNO);
	     if(validateCustomer(bref, custID))
	       {
			   if(bref instanceof CheckingAccount)
			   {
				  bref.withdraw(withDrawAmmount);
				  BankUI.AIB.displayAccountSummary();
			   }else
			   {
				 System.out.println("Can't withdraw money from a savings account");
			   }
		   }else
		   {
			   System.out.println("Invalid Customer");
		   }

   }

    public static void TransferMoney(double transferAmmount, int from_accountNO,int to_accountNumber, int custID)
      {
   	      // get the accountReferences
	      // call tranfer of the savings account

	           BankAccount bref = BankUI.AIB.getAccount(from_accountNO);
	           BankAccount to = BankUI.AIB.getAccount(to_accountNumber);
	           if(validateCustomer(bref, custID) && validateCustomer(to, custID))
	           {
				   if(bref instanceof SavingsAccount)
				   {
						bref.transferMoney(to_accountNumber, transferAmmount);


						BankUI.AIB.displayAccountSummary();
				   }else
				   {
					 System.out.println("Can't transfer from a Checking Account");
				   }
			 }else
			 {
			   System.out.println("Invalid Customer");
			 }

      }

      // check if the account belongs to the customer
      public static boolean validateCustomer(BankAccount b, int custID)
      {
          if(b.ownerID == custID)
		  return true;
		  else
		  return false;
	  }

}