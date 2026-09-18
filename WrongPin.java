package com.lalasa;

import java.util.Scanner;

public class WrongPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter correct pin");

String correctpin = sc.next();
System.out.println("enter entered pin");
String enteredpin = sc.next();
try
{
	if(!enteredpin .equals(correctpin))
	{
		throw new Exception("Invalid credintials");
	}

	System.out.println("PIN Verified");	
}
catch (Exception e)
{
	System.out.println(e.getMessage());
}
	}

}
