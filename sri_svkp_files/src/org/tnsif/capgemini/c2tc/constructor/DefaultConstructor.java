package org.tnsif.capgemini.c2tc.constructor;
class Myclass1
{
	String color;
	int cost;
	String brand;
	
	//default constructor
	Myclass1()
	{
		color="Blue";
		cost=4000000;
		brand="Audi";
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		Myclass1 obj=new Myclass1();
		System.out.println(obj.color + " "+ obj.cost+ " " +obj.brand);
	}

}