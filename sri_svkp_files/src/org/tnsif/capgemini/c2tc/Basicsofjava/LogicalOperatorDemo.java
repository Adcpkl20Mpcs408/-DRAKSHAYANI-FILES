package org.tnsif.capgemini.c2tc.Basicsofjava;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		int a=20 ,b=10,c=5;
		
		//Logical AND
		
		System.out.println("(a>b) && (b<c)" + ((a>b) && (b<c))); //false
		
		//Logical OR
		
		System.out.println("(a>b) || (b>c)" + ((a>b) || (b>c) ));//true
		
		//Logical NOT
		
		System.out.println("!(a>b) " + !(a>b));//false

	}

}