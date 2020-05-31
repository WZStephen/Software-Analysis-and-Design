package AIB_CaseStudy_CSE460;/* This class is the parenet class for savings and checking accounts


*/

public class BankAccount
{
     public int accountNumber;
     protected double balance;
     protected int ownerID;

     // default constructor
     public BankAccount()
     {
		 accountNumber=0000;
		 balance=0;
		 ownerID=0;
	 }

     // other constructor
     public BankAccount(int actNum, double bal, int owner)
	 {
	        accountNumber=actNum;
	        balance=bal;
	        ownerID = owner;

     }

     // deposit will be inherited to both savings and checking accounts
     public double deposit(double depositAmt)
     {
       if(depositAmt>0)
       balance += depositAmt;

       return balance;
    }


     // withdraw method will be implemented in the cheking account.
     // mpney can't be withdrawn from the saving account
     public void withdraw(double withDrawAmt)
       { }

       // transfer method will be implemented in the saving account.
     // mpney can't be tranferred  from the checking account
       public void transferMoney(int toAccount, double amount)
	   { }


     public String toString()
	  {
	 		return "Account no: " + accountNumber + " balance is: " + balance;
	  }


}