package com.lalasa;
import java.util.Scanner;
public class ATM_Verifypin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int correctpin = 1234;
System.out.println("entered pin");
int pin = sc.nextInt();
if(pin==correctpin) {
	System.out.println("Access Granted");
	}
else {
	System.out.println("Invalid pin");
}

	}

}
