package org.tnsif.capgemini.c2tc.Basicsofjava;
public class IfElseIfDemo {
	public static void main(String[] args) {
		
		int score=92;
		
		if(score>90)
		{
			System.out.println("Grade O");
		}
		else if(score>=80)
		{
			System.out.println("Grade A+");
		}
		else if(score>=70)
		{
			System.out.println("Grade A");
		}
		else if(score>60)
		{
			System.out.println("Grade B+");
		}
		else if(score>50)
		{
			System.out.println("Grade B+");
		}
		else if(score>40)
		{
			System.out.println("Grade C");
		}
		else if(score>30)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}