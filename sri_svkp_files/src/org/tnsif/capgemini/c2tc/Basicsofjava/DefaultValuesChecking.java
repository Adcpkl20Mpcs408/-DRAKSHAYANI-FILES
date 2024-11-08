package org.tnsif.capgemini.c2tc.Basicsofjava;
class Demo
{
	int i;
	byte b;
	float f1;
	double d2;
	char c1;
	boolean b1;
	String strvalue;//instance variable
	int a[];
}
public class DefaultValuesChecking {

	public static void main(String[] args) {
		Demo d1=new Demo();
		System.out.println(d1.i);
		System.out.println(d1.b);
		System.out.println(d1.f1);
		System.out.println(d1.d2);
		System.out.println(d1.c1 ); //not visible when printed because it is null character
		System.out.println(d1.b1);
		System.out.println(d1.strvalue);
		System.out.println(d1.a);

	}

}