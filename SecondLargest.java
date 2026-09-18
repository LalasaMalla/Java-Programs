package com.lalasa;

public class SecondLargest {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int[] numbers = {10,20,30,40,50};
	
int max = numbers[0];

	for (int i = 1; i<numbers.length; i++)
	{
	if(numbers[i]>max)
		max = numbers[i];
		
	}

	
	System.out.println(max);
		}

	}

	