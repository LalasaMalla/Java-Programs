package com.lalasa;

public class InvalidAccountnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accountNumber = "123";

		try {
			if (accountNumber.length() != 10) {
		        throw new Exception("Invalid account number");
		    }

		    System.out.println("Account number accepted");

		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}
	}

}
