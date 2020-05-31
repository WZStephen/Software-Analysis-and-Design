package Sport_Concussion_Assessment_System;

import java.util.Scanner;

public class SCAS_UI {


    public static void main(String[] args){

        boolean exit_flag = false;

        Scanner scan = new Scanner(System.in);

        Athletes athlete = new Athletes();
        Sport_Medical_Practitioner smp = new Sport_Medical_Practitioner();

        do{
            displayMenu();
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    athlete.collect_sympotoms();
                    break;
                case 2:
                    smp.current_symptoms_summary(athlete);
                    break;
                case 3:
                    smp.if_at_risk(athlete);
                    break;
                case 4:
                    exit_flag = true;
                    break;
                default:
                    System.out.println("Invalid Input ");
            }
        }while(!exit_flag);
        System.out.println("You have been logged out!");
    }

    static void displayMenu()
    {
        System.out.println("\nWelcome to Sport Concussion Assessment System");
        System.out.println("==================================");
        System.out.println("Please select one of the following options");
        System.out.println("\t\t  1. Enter Symptoms");
        System.out.println("\t\t  2. Display Symptoms Summary");
        System.out.println("\t\t  3. I Am I at Risk?");
        System.out.println("\t\t  4. Exit");
        System.out.print("Enter your choice (1-4): ");
    }
}



