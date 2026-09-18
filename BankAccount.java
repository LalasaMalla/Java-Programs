package com.lalasa;

public class BankAccount {

	
		  private double balance;

		    void deposit(double amount) {
		        if (amount > 0) {
		            balance = balance + amount;
		        }
		    }

		    void withdraw(double amount) {
		        if (amount > 0 && amount <= balance) {
		            balance = balance - amount;
		        }
		    }

		    double getBalance() {
		        return balance;
		    }
		    public static void main(String[] args) {

		        BankAccount account = new BankAccount();

		        account.deposit(10000);
		        account.withdraw(3000);

		        System.out.println("Balance : " + account.getBalance());
	}

}
