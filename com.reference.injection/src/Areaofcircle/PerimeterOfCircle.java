package Areaofcircle;

public class PerimeterOfCircle {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public PerimeterOfCircle(int radius) {
		super();
		this.radius = radius;
	}

	public PerimeterOfCircle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double calperi()
	{
		double peri;
		peri = 2*3.14*radius;
		return peri;
	}

}
