package com.lalasa;

import java.util.Scanner;

public class Scannerprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
/*
System.out.println("enter a byte value");
byte b = sc. nextByte();
System.out.println("enter short value");
short s = sc.nextShort();
System.out.println("enter a integer value");
int i = sc.nextInt();
System.out.println("enter long value");
long l = sc.nextLong();
System.out.println("enter float value");
float f = sc.nextFloat();
System.out.println("enter double value");
double d = sc.nextDouble();
System.out.println("enter BOOLEAN value");
boolean bool = sc.nextBoolean();
System.out.println("PRINT TOTAL LINE");
String st = sc.nextLine();
System.out.println("Enter one  word");
String str = sc.next();*/
System.out.print("Enter one word: ");
String word = sc.next();

sc.nextLine();  // consumes leftover Enter key

System.out.print("Enter a complete sentence: ");

String line = sc.nextLine();
System.out.println("Enter one  word");
String str = sc.next();
sc.nextLine();
System.out.println("PRINT TOTAL LINE");
String st = sc.nextLine();
//System.out.println(b + " "  + s+ " " + i+ " " + l+" " + f+ " " + d+" " + bool+" " + str+" " + st+" ");

/*System.out.print("Enter a complete sentence: ");
String line = sc.nextLine(); */
	}

}
