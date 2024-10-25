package Basicsofjava;
public class VariablesDemo {
			int id=10; //instance variable
			void print()
			{
				String msg="Hii"; //local variable
				System.out.println(msg);
			}
	static String message="I am Drakshayani"; //static variable
	public static void main(String[] args) {
		VariablesDemo obj=new VariablesDemo();
		System.out.println(obj.id);
		obj.print();
		System.out.println(message);
		
	}
}