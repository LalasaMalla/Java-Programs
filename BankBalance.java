package com.lalasa;

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter balance, withdraw amount");
		
		int balance = sc.nextInt();
		
		int withdraw = 7500;
		try
		{
			if (withdraw > balance) {
				throw new Exception ("insufficent balance");
		}
			balance = balance - withdraw;
			System.out.println("withdrawal Successfull");
			
		}
	catch (Exception e) {
		
	System.out.println("Trasaction Failed: " + e.getMessage());	
	}
	}

}
