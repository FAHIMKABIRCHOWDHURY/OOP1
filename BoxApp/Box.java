/*

Write a Class in Java named Box. The class has Three Attributes.
They are:
	- double length
	- double width
	- double height
	
The class also has one set method and one get method for each of
the attributes. The class also has a main method. Inside the main
method, create one object of the Box class and demonstrate all the
methods
*/


import java.lang.*;

public class Box
{
	
	private double length;
	private double width;
	private double height;
	
	
	public void setLength(double l)
	{
		length = l;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getHeight()
	{
		return height;
	}
	
	public static void main(String args[])
	{
		Box b = new Box();
		
		b.setLength(1.7);
		b.setWidth(1.5);
		b.setHeight(1.2);
		
		//cout<<"Length is: "<<b.getLength()<<endl;
		
		//System.out.print("Length is: "+b.getLength()+"\n");
		System.out.println("Length is: "+b.getLength());
		System.out.println("Width is: "+b.getWidth());
		System.out.println("Height is: "+b.getHeight());	
	}
}




