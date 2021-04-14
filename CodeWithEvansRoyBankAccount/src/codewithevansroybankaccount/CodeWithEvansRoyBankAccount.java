/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewithevansroybankaccount;

import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class CodeWithEvansRoyBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char bankAccount,response;
	String accountHolder;
	long accountNumber;
	double deposit,balance,withdrawal;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("******Banking Operations*******");
        System.out.print("Enter Account Holder Name:");
        accountHolder= keyboard.nextLine();
        System.out.println("holder= "+accountHolder);
        System.out.print("Enter Account Number:");
        accountNumber = keyboard.nextLong();
        System.out.print("Enter Your Deposit:");
        deposit = keyboard.nextDouble();


        balance = deposit;
        System.out.println("Balance: " + balance);


        do {
            System.out.println("******Select Bank Type Account******");
            System.out.println("[1] SAVINGS ACCOUNT");
            System.out.println("[2] CURRENT ACCOUNT");
            System.out.println("[3] Quite ");
            bankAccount = keyboard.next().charAt(0);
            System.out.println();

            switch (bankAccount)
            {
                case '1':
                    System.out.println("How Much Would you like to Withdraw? ");
                    withdrawal = keyboard.nextDouble();
                    if (withdrawal < balance){
                        System.out.println("You have Successfully withdrawn: " + withdrawal);
                        double newBalance = balance - withdrawal;
                        System.out.println("New Balance: " + newBalance);
                       //Calculation of Interest per Year
                        double rate = 0.20;
                        double interest = newBalance *rate;
                        System.out.println("You Interest per Year is: " + interest);
                        double totalBalance = newBalance + interest;
                        System.out.println("Total Balance Per Year is: " + totalBalance);

                    }else {
                        System.out.println("You have Insufficient Balance, You can Only withdraw amount less than Your balance");
                    }
                    break;
                case '2':
                    double Overdraft = 1000;
                    System.out.println("How Much Would you like to Withdraw? ");
                    withdrawal = keyboard.nextDouble();
                    if (withdrawal > balance && withdrawal < Overdraft){

                        System.out.println("You have Successfully withdrawn: " + withdrawal);
                        double newBalance = balance - withdrawal;
                        System.out.println("New Balance: " + newBalance);
                    }
                    else {
                        System.out.println("You cannot Withdraw amount More Than Overdraft Set");
                    }
                    break;
                case '3':
                    System.out.println("Thank you for Using this System");

                default:
                    System.out.println("You are only Allowed to Select From 1 and 3");


            }
        }while (bankAccount!= '3');


    }
    
    
}


