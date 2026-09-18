package com.lalasa;
import java.util.Scanner;
public class SwitchExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st  switch case example for days
	/*	
int day = 5;
switch (day) {
	case 1: 
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("tuesday");
		break;
	case 3:
		System.out.println("wednesday");
		break;
	case 4:
		System.out.println("thursday");
		break;
	case 5:
		System.out.println("friday");
		break;
	case 6:
		System.out.println("saturday");
		break;
	case 7:
		System.out.println("sunday");
		break;
		}*/
		
		
	//2nd 	switch case example for atm
		
	/*	
int choice = 4;
switch(choice) {
	   case 1:
           System.out.println("Check Balance");
           break;

       case 2:
           System.out.println("Withdraw Money");
           break;

       case 3:
           System.out.println("Deposit Money");
           break;

       case 4:
           System.out.println("Change PIN");
           break;

       case 5:
           System.out.println("Exit");
           break;

       default:
           System.out.println("Invalid choice");

}

*/
		
	/*	String signal = "Green";
		switch(signal) {
		case "Red" : 
			System.out.println("STOP");
			break;
		case "Yellow" :
			System.out.println("WAIT");
			break;
		case "Green" :
			System.out.println("GO");
			break;
			default :
				System.out.println("invalid");
					
		
		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr thye balance amount");
		int bal=sc.nextInt();
		String st[]=new String[10];
		int i=0, choice=0;
	do {
		System.out.println("Dear card holder please select one option from below");
	System.out.println("1.Balance enquiry:  ");
	System.out.println("2.Mini statement:  ");
	System.out.println("3.cash withdraw:  ");
	System.out.println("4.cash deposit: ");
	System.out.println("5.account holder name:");
	System.out.println("6.Exit");
	
	System.out.println("Enter your choice: ");
	
    choice = sc.nextInt();
	
	switch(choice){
		case 1: 
			System.out.println("Balance enquiry: ");
			System.out.println("balance amount: "+bal);
			System.out.println("==============================");
			break;
		case 2:
			System.out.println("Mini Statement : ");
			for(String k:st) {
				if(k!=null) 
				System.out.println(k);
				else
					continue;		
			}
			System.out.println("==============================");

			break;
	   case 3:
		   System.out.println("Cash Withdrawl");
		   System.out.println("Enter the withdrawl amount:");
		   int w=sc.nextInt();
		   bal-=w;
		   st[i]="Withdrawn amount: "+w;i++;
			System.out.println("==============================");

		   break;
	   case 4:
		   System.out.println("Cash Deposit:");
		   System.out.println("Enter the deposit amount:");
		   int d=sc.nextInt();
		   bal+=d;
		   st[i]="Depositted amount: "+d;
		   i++;
			System.out.println("==============================");

		   break;
	   case 5:
		   sc.nextLine();   // consume leftover Enter

		    System.out.print("Enter account holder name: ");
		    String aname = sc.nextLine();

		    System.out.println("Account holder: " + aname);
		    System.out.println("==============================");
		    break;
		   
		default:
			System.out.println("Invalid choice!, Enter valid choice......");
	}
	}
	while (choice!=6);

	sc.close();
}
}
