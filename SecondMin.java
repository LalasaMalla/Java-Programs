
package com.lalasa;

import java.util.*;
import java.util.Scanner;
public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int min=Integer.MAX_VALUE;
int sec_min=min;
System.out.println(min);
System.out.println("Enter the array size");
int n=sc.nextInt();
int ar[] = new int[n];
System.out.println("Enter " +n+ " elements");
for(int i=0;i<n;i++)
{	
	ar[i]=sc.nextInt();
	if(ar[i]<=min)
	{
		sec_min=min;
		min=ar[i];
	}
}

System.out.println("minimum = " + min);
System.out.println("second minimum = " + sec_min);
sc.close();
	}

}
