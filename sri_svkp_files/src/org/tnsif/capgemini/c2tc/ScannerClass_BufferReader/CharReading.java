package org.tnsif.capgemini.c2tc.ScannerClass_BufferReader;
import java.util.Scanner;
public class CharReading {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string:");
		char c=scan.next().charAt(2);
		System.out.println("the third character of the input string " + c);
	}

}