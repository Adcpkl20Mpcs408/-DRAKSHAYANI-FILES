package org.tnsif.capgemini.c2tc.collectionsdemo;
class Person
{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	void displayinfo()
	{
		System.out.println("Name : "+ name  + " Age :"+ age);
	}
}
public class Before_Comparable {

	public static void main(String[] args) {
		Person person1=new Person("Venkat",24);
		Person person2=new Person("Surya",22);
		person1.displayinfo();
		person2.displayinfo();
	}
}