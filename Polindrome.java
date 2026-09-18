package com.lalasa;
import java.util.Scanner;
public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter a number : ");
int num = sc.nextInt();
int original = num;
int reverse = 0;
while(num>0)
{
	int digit = num%10;
	reverse = reverse*10+digit;
	num = num/10;
	
}
if(original==reverse) {
	System.out.println("Palandrome");
}
else {
	System.out.println("not palandrome");
}
sc.close();
	}

}
