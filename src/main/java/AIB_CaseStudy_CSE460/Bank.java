package AIB_CaseStudy_CSE460;
/* This program simulate the AIB Bank operations
   bank maintains a list of customers and bank accounts
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Bank
{
       Scanner scan = new Scanner(System.in);
       // list of bank accounts and customers
       ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
       ArrayList<Customer> customers = new ArrayList<Customer>();


       //add a customer to the bank
	   public  void addAccount()
	   {
		   // read the cutsomer ID, initial deposit, account type
		   // account creater will assign a 5 digit account number
		   // create and add to the account list

		  System.out.println("Cust ID?: ");
		  int cid = scan.nextInt();

		  System.out.println("Initial Deposit?: ");
		  double iniDep = scan.nextDouble();

		  System.out.println("Five digit Account Number ?: ");
		  int actNum = scan.nextInt();

		  System.out.println("Account Type (1 - Checking  or 2: Saving)?: ");
		  int type = scan.nextInt();

          if(type == 1){
		  CheckingAccount ca = new CheckingAccount(actNum, iniDep, cid);
		  accounts.add(ca);
	      }else
	      {
	       SavingsAccount sa = new SavingsAccount(actNum, iniDep, cid);
		   accounts.add(sa);
		  }


	   }

	   public  void addCustomer()
	   {
		  // read the cutsomer information and add to the list
		  // Customer class automatically generates a 4 digit account number
		  scan.nextLine(); // clear the input stream
          System.out.println("First Name?: ");
		  String f_Name = scan.nextLine();
		  System.out.println("Last Name?: ");
		  String l_Name = scan.nextLine();
		  System.out.println("Phone Number?: ");
		  String p_Number =  scan.nextLine();
		  Customer c = new Customer(f_Name, l_Name, p_Number);
		  customers.add(c);
	   }

      // this method returns a reference to the customer object from the list based on the customer ID given
      // if no customer found, return null.
       public  Customer getCustomer(int custID)
       {
		   Customer c = null;
           for(int i=0; i < customers.size() ; i++){

           if(customers.get(i).custID == custID)
		    c = customers.get(i);

	       }

	       return c;
	   }

	   // this method returns a reference to the Account object from the list based on the account number given
      // if no account found, return null.
	   public  BankAccount getAccount(int actNumber)
	   {
		   BankAccount b = null;
		   for(int i=0; i < accounts.size() ; i++){

		   if(accounts.get(i).accountNumber == actNumber)
			b = accounts.get(i);
		   }
	       return b;
	   }

	   public void displayAccountSummary()
	   {
		   for(int i=0; i < accounts.size() ; i++){

			   System.out.println(accounts.get(i));
		   }
	   }
}