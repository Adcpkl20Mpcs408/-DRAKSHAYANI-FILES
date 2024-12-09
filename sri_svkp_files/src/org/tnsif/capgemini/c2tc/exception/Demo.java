package org.tnsif.capgemini.c2tc.exception;
public class Demo {
	public static void main(String[] args) {
		int a=150;
		int b=100;
		int sum=add(a,b);
		
		System.out.println(sum);
	}
	public static int add(int a,int b)
	{
		return a-b;
	}

}