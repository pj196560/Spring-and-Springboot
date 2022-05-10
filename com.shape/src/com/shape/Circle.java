package com.shape;

public class Circle implements Shape {
	private int radius;
	public Circle()
	{
		this.radius=10;
	}
	public Circle(int radius)
	{
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double calarea() {
		double area = 3.14*(this.radius* this.radius);
		System.out.println("area is::");
		return area;
	}

}
