package org.tnsif.capgemini.c2tc.staticDemo;

public class StaticBlock {

	public void display()
	{
		System.out.println("Instance block -1");
	}
	static
	{
		System.out.println("Static block -1");
	}
	static
	{
		System.out.println("Static block -2");
	}
	public static void main(String[] args) {
		StaticBlock obj=new StaticBlock ();
		obj.display();
	}
}