package org.tnsif.capgemini.c2tc.exception;

public class ArithematicException {

	public static void main(String[] args) {
		int number_one=500/50;
		System.out.println(number_one); //10
		int number_two=500/100;
		System.out.println(number_two);//5
		try {
			int number_three=500/0;
			System.out.println(number_three); 
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		int number_four=500/250;
		System.out.println(number_four);//2

	}

}