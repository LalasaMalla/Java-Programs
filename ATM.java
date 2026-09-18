package com.lalasa;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		int correctpin = 6031;
		int enterdpin = 1446;
		{
			try
			{
				if(enterdpin != correctpin)
				{
				throw new Exception("invalid creditials");
					}
				System.out.println("loginsucessfull");
			}
			catch (Exception e)
			{
			System.out.println(e.getMessage());	
			}
		}
	    }
	
	}


