package org.tnsif.capgemini.c2tc.staticDemo;
class MathUtils
{
	public static int square(int number)
	{
		return number * number;
	}
	public static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		int result1=MathUtils.square(5);
		 int result2=MathUtils.add(1,2,3);
		 System.out.println("square of 5: " + result1);
		 System.out.println("add of number: " + result2);
	}

}