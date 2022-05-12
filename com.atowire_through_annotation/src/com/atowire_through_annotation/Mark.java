package com.atowire_through_annotation;

public class Mark {
	
	private double sub1_marks;
	private double sub2_marks;
	private double sub3_marks;
	private double sub4_marks;
	private double sub5_marks;
	private double sub6_marks;
	
	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mark(double sub1_marks, double sub2_marks, double sub3_marks, double sub4_marks, double sub5_marks,
			double sub6_marks) {
		super();
		this.sub1_marks = sub1_marks;
		this.sub2_marks = sub2_marks;
		this.sub3_marks = sub3_marks;
		this.sub4_marks = sub4_marks;
		this.sub5_marks = sub5_marks;
		this.sub6_marks = sub6_marks;
	}

	public double getSub1_marks() {
		return sub1_marks;
	}

	public void setSub1_marks(double sub1_marks) {
		this.sub1_marks = sub1_marks;
	}

	public double getSub2_marks() {
		return sub2_marks;
	}

	public void setSub2_marks(double sub2_marks) {
		this.sub2_marks = sub2_marks;
	}

	public double getSub3_marks() {
		return sub3_marks;
	}

	public void setSub3_marks(double sub3_marks) {
		this.sub3_marks = sub3_marks;
	}

	public double getSub4_marks() {
		return sub4_marks;
	}

	public void setSub4_marks(double sub4_marks) {
		this.sub4_marks = sub4_marks;
	}

	public double getSub5_marks() {
		return sub5_marks;
	}

	public void setSub5_marks(double sub5_marks) {
		this.sub5_marks = sub5_marks;
	}

	public double getSub6_marks() {
		return sub6_marks;
	}

	public void setSub6_marks(double sub6_marks) {
		this.sub6_marks = sub6_marks;
	}
	
	public String toString()
	{
		return "subject1  marks::"+this.sub1_marks+"\n"+
				"subject2  marks::"+this.sub2_marks+"\n"+
				"subject3  marks::"+this.sub3_marks+"\n"+
				"subject4  marks::"+this.sub4_marks+"\n"+
				"subject5  marks::"+this.sub5_marks+"\n"+
				"subject6  marks::"+this.sub6_marks+"\n";
	}
	
	public double addition_marks()
	{   double total;
		total= this.sub1_marks+this.sub2_marks+this.sub3_marks+this.sub4_marks+this.sub5_marks+this.sub6_marks;
		System.out.println("total marks of student out of 600 is:: ");
		return total;
		
	}
	
	
	public double percentage_obtained()
	
	{
		double per;
		per=((sub1_marks+sub2_marks+sub3_marks+sub4_marks+sub5_marks+sub6_marks)/600)*100;
		System.out.println("total percentage obtained by student");
		return per;
	}

	

}
