package com.lalasa;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			  if (ch == 'a' || ch == 'e' || ch == 'i' || 
		                ch == 'o' || ch == 'u') {

		                System.out.println(ch + " is a vowel");

		            } else {
		                System.out.println(ch + " is a consonant");
		            }
		        }
		    }
		}