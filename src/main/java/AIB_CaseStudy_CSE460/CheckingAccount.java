package AIB_CaseStudy_CSE460;/* data memebers and the deposit method will be inherited from the parent class BankAccount
*/

public class CheckingAccount extends BankAccount
{
    public CheckingAccount()
   {
      super();

   }

    public CheckingAccount(int actNum, double bal, int owner)
     {
       super(actNum, bal, owner);
    }

   // withdraw implemented in the checking account
       public void withdraw(double withDrawAmt)
	   {
	            if(withDrawAmt<=balance)
	            balance -=withDrawAmt;

       }


  }

