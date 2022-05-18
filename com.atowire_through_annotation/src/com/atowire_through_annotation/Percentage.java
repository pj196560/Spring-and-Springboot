package com.atowire_through_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Percentage {
	
	private String student_name;
	private String std;
	
	private String sub1;
	private String sub2;
	private String sub3;
	private String sub4;
	private String sub5;
	private String sub6;

	@Autowired
	@Qualifier("temp3")
	private Mark marks;
	
	public Percentage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Percentage(String student_name, String std, String sub1, String sub2, String sub3, String sub4, String sub5,
			String sub6, Mark marks) {
		super();
		this.student_name = student_name;
		this.std = std;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		this.marks = marks;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getSub1() {
		return sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	public String getSub2() {
		return sub2;
	}

	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}

	public String getSub3() {
		return sub3;
	}

	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}

	public String getSub4() {
		return sub4;
	}

	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}

	public String getSub5() {
		return sub5;
	}

	public void setSub5(String sub5) {
		this.sub5 = sub5;
	}

	public String getSub6() {
		return sub6;
	}

	public void setSub6(String sub6) {
		this.sub6 = sub6;
	}

	public Mark getMarks() {
		return marks;
	}
	public void setMarks(Mark marks) {
		this.marks = marks;
	}
	
	public String toString()
	{
		return "Student Name::"+this.student_name+"\n"+
	    "Standard::"+this.std+"\n"+
	    "subject1::"+this.sub1+"\n"+
	    "subject2::"+this.sub2+"\n"+
	    "subject3::"+this.sub3+"\n"+
	    "subject4::"+this.sub4+"\n"+
	    "subject5::"+this.sub5+"\n"+
	    "subject6::"+this.sub6+"\n"+
		 this.marks+"\n";	
		
	}
	
	public double stud()
	{
		return marks.addition_marks();
	}
	public double stud1()
	{
		return marks.percentage_obtained();
		
	}

}
