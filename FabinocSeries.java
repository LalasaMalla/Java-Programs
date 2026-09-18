package com.lalasa;
import java.util.Scanner;
public class FabinocSeries {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
System.out.println("enter number: ");
int n = sc.nextInt();
//in fabinocci series usually starts with 0 and 1
int a = 0;
int b = 1;
for(int i=1;i<=n;i++) {
	System.out.println(a+ " ");
	int c= a + b;
	a=b;
	b=c;
}
sc.close();
	}

}
