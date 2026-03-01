package com.atm;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmOperations op = new AtmOperationsImp();
		int atmnumber = 123;
		int atmpin = 123456;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine");
		System.out.print("Enter Atm Number: ");
		int atmNum = sc.nextInt();
		System.out.print("Enter PIN: ");
		int pin = sc.nextInt();
		if((atmnumber == atmNum) && (atmpin == pin))
		{
			System.out.println("Validation Done");
			while(true)
			{
				System.out.println("\n 1.View Available Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View MiniStatement\n 5.Exit");
				System.out.println("Enter Choice: ");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					op.viewBalance();
				}
				else if(ch == 2)
				{
					System.out.println("Enter Amount to WithDraw: ");
					double withDrawAmt = sc.nextDouble();
					op.withdrawAmount(withDrawAmt);
				}
				else if(ch == 3)
				{
					System.out.print("Enter Amount to Deposit: ");
					double dep = sc.nextDouble();
					op.depositAmount(dep);
				}
				else if(ch == 4)
				{
					op.viewMiniStatement();
				}
				
				else if(ch == 5)
				{
	
					System.out.println("Collect Your ATM Card\nThank you for using ATM Machine");
					System.exit(0);
				}
				else
				{
					System.out.println("Please Enter a Valid Choice");
				}
			}
		}
		else 
		{
			System.out.println("Incorrect Atm Number or PIN");
			System.exit(0);
		}
	}

}
