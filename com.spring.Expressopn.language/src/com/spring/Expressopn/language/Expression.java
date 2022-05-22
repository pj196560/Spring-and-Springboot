package com.spring.Expressopn.language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("demo")
public class Expression {
	@Value("#{15+16}")
	private int a;
	@Value("#{10<8?88:100}")
	private double b;
	@Value("#{T(java.lang.Math).sin(4.5)}") 
	private double c;
	@Value("#{new java.lang.String('pratik jadhav')}")
	private String name;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Expression [a=" + a + ", b=" + b + ", c=" + c + ", name=" + name + "]";
	}
	
	

}
