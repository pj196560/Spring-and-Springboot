package Areaofcircle;

public class Acircle {
	
	private int radius;
	private PerimeterOfCircle ob;
	
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public PerimeterOfCircle getOb() {
		return ob;
	}
	public void setOb(PerimeterOfCircle ob) {
		this.ob = ob;
	}
	public Acircle(int radius, PerimeterOfCircle ob) {
		super();
		this.radius = radius;
		this.ob = ob;
	}
	public Acircle() {
		super();
	}
	public String CalArea()
	{
		double area;
		area = 3.14*(this.radius*this.radius);
		return "areaof circle is"+area;
	}
	public String obj() {
		return "perimeter of circle is::"+ob.calperi();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
