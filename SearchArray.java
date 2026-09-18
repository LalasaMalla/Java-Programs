package com.lalasa;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50};
		int Search = arr[2];
		boolean  found = false;
		//initially, we assumed that element is not found
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == Search)
				//If the current array element equals 30, the element is found.
			{
				System.out.println("element found at index: " + i);
				found = true;
				break;
			}
		}
		if(!found) {
		System.out.println("element not found");
		
	}
	
	

}}
