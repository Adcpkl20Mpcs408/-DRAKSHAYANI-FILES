package org.tnsif.capgemini.c2tc.oops;
class Human1
{
	 int age;
	String name;
}


public class BeforeEncapsulation {

	public static void main(String[] args) {
		Human1 obj=new Human1();
		obj.age=25;
		obj.name="Roshan";
		obj.age=24;
		obj.name="Gowthami";
		System.out.println("Age is "  +obj.age);
		System.out.println("Name is " +obj.name);

	}

}