/*Why did we wrote  System.out.println() for printing anything?

println() method belongs to java.io.PrintStream class.
So, we need an object of PrintStream class to call the println() method.
The System class has a static attribute named 'out' which is of PrintStream type.
This out object of PrintStream class is used to call the println() method of PrintStream class.
and as out is a static attribute, we need to use the name of the class to access it. 
And that's how we get:

	System.out.println()
*/
import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class ScannerDemo
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String s1, s2, s3;
		int i;
		double d;
		char c;
		/*
		System.out.print("Enter a String: ");
		s1 = sc.nextLine();
		
		System.out.print("Enter a String: ");
		s2 = sc.next();
		
		System.out.println("Your 1st String: " + s1);
		System.out.println("Your 2nd String: " + s2);
		
		*/
		System.out.print("Enter an integer: ");
		i = sc.nextInt();
		
		System.out.print("Enter a double: ");
		d = sc.nextDouble();
		
		System.out.print("Enter a character: ");
		c = sc.next().charAt(0);
		
		System.out.println("Your integer: " + i);
		System.out.println("Your double: " + d);
		System.out.println("Your character: " + c);
		
		System.out.print("Enter another String: ");
		s3 = bfr.readLine();
		
		System.out.println("Your 3rd String: " + s3);
	}
}