package org.tnsif.capgemini.c2tc.oops;
class Dress
{
	String model;
	int size;
	
	Dress() ///constructor with no parameter
	{
		model="Lehanga";
		size=34;
	}
	
	Dress(String model)//constructor with one parameter
	{
		this.model=model;
		size=36;
	}
	Dress(String model, int size)//constructor with two parameter
	{
		this.model=model;
		this.size=size;
	}
	void display()
	{
		System.out.println("model :" +model +" and size :" + size );
	}
}
public class Constructor_Overloading {

	public static void main(String[] args) {
		Dress Dress1=new Dress();
		Dress Dress2=new Dress("Kurtha");
		Dress Dress3=new Dress("Punjabi" ,38);
		
		Dress1.display();
		Dress2.display();
		Dress3.display();

	}
}
