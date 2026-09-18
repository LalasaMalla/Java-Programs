package com.lalasa;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String str = "Hello";
	        String rev = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev = rev + str.charAt(i);
	        }

	        System.out.println("Original String: " + str);
	        System.out.println("Reverse String: " + rev);
	    }
	}
