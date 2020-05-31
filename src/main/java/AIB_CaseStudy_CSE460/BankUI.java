package AIB_CaseStudy_CSE460;/*This program simulate the AIB user interface for the customer and the bank representative
  the bank representative can add customers and accounts for the customer
  the customer can call deposit, withdraw, transfer money and account summary functions

  */

import java.util.Scanner;
public class BankUI
{
   // get a reference to the Bank instance
   public static Bank AIB = new Bank();

   public static void main(String[] args)
   {
        Scanner scan = new Scanner(System.in);

     do{
         displayMenu();
         int choice = scan.nextInt();

       switch(choice)
       {
		   case 1:
           AIB.addCustomer();
		   break;

		   case 2:
           AIB.addAccount();
		   break;

           // depost meoney by customer
		   case 3:
		   System.out.println("Cust ID: ");
		   int id = scan.nextInt();
           Customer cref = AIB.getCustomer(id);
           if(cref != null)
           cref.depositMoney();
           else
           System.out.println("No Such Customer");

		   break;

            // withdraw meoney by customer
		   case 4:
		    System.out.println("Cust ID: ");
		    id = scan.nextInt();
		    cref = AIB.getCustomer(id);
		    if(cref != null)
            cref.withDrawMoney();
            else
            System.out.println("No Such Customer");
		   break;

            // transfer meoney by customer
		   case 5:
		   System.out.println("Cust ID: ");
		   id = scan.nextInt();
		   cref = AIB.getCustomer(id);
		   if(cref != null)
		   cref.TransferMoney();
		   else
		   System.out.println("No Such Customer");

		   break;


		   case 6:
		   AIB.displayAccountSummary();
		   break;


		   case 7:
		   System.out.println("Exciting the program... ");
		   System.exit(0);

		   break;

		   default:
		   System.out.println("Invalid Input ");
         }

	   } while(true);

   }

   static void displayMenu()
   {
	  		   System.out.println("Welcome to Arizona Investment Bank");
	           System.out.println("==================================");
	           System.out.println("Please select one of the following options");
	           System.out.println("\t\t  1. Add Customer");
	           System.out.println("\t\t  2. Add Account");
	           System.out.println("\t\t  3. Deposit");
	           System.out.println("\t\t  4. Withdraw");
	           System.out.println("\t\t  5. Transfer Money");
	           System.out.println("\t\t  6. Show Account Summary");
               System.out.println("\t\t  7. Exit");

   }


}