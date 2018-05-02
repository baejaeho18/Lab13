package edu.handong.csee.java.lab13.prob3;

public class Circle1 extends Shape {

	private double radius;

	public Circle1(double r)
	{
		radius = r;
	}
	public void Circle(double n1) {
		// TODO Auto-generated constructor stub
	}
	public double area()
	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r
	}
	public double perimeter()
	{
		return 2.0 * Math.PI * radius; // 2 * pi * radius
	}
	public double get_Radius()
	{
		return radius;
	}

}
