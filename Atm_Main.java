package CoreJava;

import java.util.Scanner;


public class Atm_Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = s1.nextLine();
        Atm a = new Atm(name, 0); 

        int choice;

        do {
            System.out.println("Welcome to Axis Bank");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            choice = s1.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = s1.nextDouble();
                    a.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = s1.nextDouble();
                    a.withdraw(withdrawAmount);
                    break;
                case 3:
                    a.viewBalance();
                    break;
                case 4:
                    System.out.println("Thanks "+name+" for using Axis Bank...");
                    break;
                default:
                    System.out.println("Invalid option. Please select above options ");
            }
        } 
        while (choice != 4);

        s1.close();
    }
}
