package P2_Directory_Management_System_Phase_I;

import java.util.ArrayList;
import java.util.Scanner;
public class PersonnelDirectory
{
   public static void main(String[] args)
   {
	  Personnel per = new Personnel();
	  totalObjects total = new totalObjects();
	  Scanner scan = new Scanner(System.in);
	  String firstN, lastN, middleN;
	  int empID;
	  double salary;
	  int choice = -1;

      do{
          System.out.println("Welcome to the Directory_Management_System.Personnel Directory Management System");
          System.out.println("====================================================");

          System.out.println("\n\n\t 1. Add Personel");
          System.out.println("\n\t 2. Find Personel");
          System.out.println("\n\t 3. Print Names");
          System.out.println("\n\t 4. Number of Entries in the Directory");

          System.out.println("\n\t Select one of the options above (1, 2, 3, 4)");
          choice = scan.nextInt();
          scan.nextLine();

          switch(choice)
          {
			  case 1:
					System.out.println("Enter first name: ");
					firstN = scan.nextLine();
					System.out.println("Enter last name: ");
					lastN = scan.nextLine();
					System.out.println("Enter middle name: ");
					middleN = scan.nextLine();

					System.out.println("Enter empploy id : ");
					empID = scan.nextInt();
					System.out.println("Enter base salaey" );
					salary = scan.nextDouble();
					scan.nextLine();

					Employee e1  = new Employee(lastN, firstN, middleN, empID, salary);

				  	//Stamp coupling
				  	per.addPersonnel(e1);

					total.objectAdded();
					break;

			  case 2:
					System.out.println("Enter firts name : ");
					firstN = scan.nextLine();

					System.out.println("Enter last name : ");
					lastN = scan.nextLine();

					boolean found = false;
					int loc =-1;

					//FIXME: Common coupling
				  	ArrayList<Person> personList = per.getPersonList();
					for(int i =0; i <personList.size(); i++) {
						if(personList.get(i).getFirst().equals(firstN) && personList.get(i).getLast().equals(lastN)) {
							found = true;
							loc = i;
						}
					}

					if(found) {
					  	System.out.println("Found");
						//FIXME: Control coupling (Cond)
						per.getPersonList().get(loc).printName0();
					}else {
					  	System.out.println("not found");
					  	Person p1  = new Person(lastN, firstN, " ");

						//FIXME: Content coupling
						//per.personList.add(p1);
					  	per.addPersonnel(p1);

					  	total.objectAdded();
					}
					break;

			  case 3:
					System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
					int order = scan.nextInt();
					for(int i=0; i<per.getPersonList().size(); i++) {

						//FIXME: Control coupling (Cond)
						//per.personList.get(i).printName(order);
						if(order == 0){
							per.getPersonList().get(i).printName0();
						}
						else if(order == 1){
							per.getPersonList().get(i).printName1();
						}
						else{
							per.getPersonList().get(i).printName2();
						}
					}
					break;

			  case 4:
					System.out.println("Total Entries : " + total.getTotalObjects());
					break;

		  }

	  } while(true);
   }

}