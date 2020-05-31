package AIB_CaseStudy_CSE460;

/* data memebers and the deposit method will be inherited from the parent class BankAccount
*/
public class SavingsAccount extends BankAccount
{

        public SavingsAccount()
	    {
	       super();
	    }

	    public SavingsAccount(int actNum, double bal, int owner)
	     {
	        super(actNum, bal, owner);
	      }


         // Transfer money from a savings account to a checking account
         public void transferMoney(int toAccount, double amount)
         {

			               BankAccount bref = BankUI.AIB.getAccount(toAccount);
			 		  	   if(bref instanceof CheckingAccount)
			 		  	   {
			 		  	        bref.deposit(amount);
			 		  	        balance = balance - amount;
			 		            BankUI.AIB.displayAccountSummary();
			 		  	   }else
			 		  	   {
			 		  		 System.out.println("Can't transfer to a savings account");
		  	               }

         }

}