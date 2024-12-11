package org.tnsif.capgemini.c2tc.lambdaexpressiondemo;
//demo on withoutlambdaexpression
interface Drawable //functional interface
{
	public void draw(); 
}
class Test implements Drawable
{
	int width=10;
	@Override
	public void draw() {
		System.out.println("Drawing "+width);	
	}
}
public class WithOutLambdaExpression {
	public static void main(String[] args) {
		Drawable d=new Test();
		d.draw();
	}
}