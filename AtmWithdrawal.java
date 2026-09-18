package com.lalasa;

public class AtmWithdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dailylimit = 15000;
int withdraw = 20000;
try
{
	if(withdraw > dailylimit)
	{
		throw new Exception("limit exceed");
		
	}                                           
	System.out.println("Withdraw amount successfull");
	
}
	catch (Exception e)
	{
		System.out.println(e.getMessage());                
	}
	}	

}
