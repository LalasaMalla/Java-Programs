package com.lalasa;

public class MultipleThrows {
	
	 static void test() throws ArithmeticException, ArrayIndexOutOfBoundsException {

	        int a = 10;
	        int b = 0;

	        System.out.println(a / b);

	        int[] arr = {10, 20, 30};
	        System.out.println(arr[5]);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try {
	            test();
	        }
	        catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero");
	        }
	        catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is out of range");
	        }
	}

}
