package org.tnsif.capgemini.c2tc.oops;
class Human
{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
public class Encapsulation {
	public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(21);
		obj.setName("Sri");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(20);
		obj.setName("Keerthana");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	
	}

}