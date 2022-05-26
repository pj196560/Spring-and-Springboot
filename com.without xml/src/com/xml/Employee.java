package com.xml;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;

//@Component("E")
public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Value("#{'pratik nandkishor jadhav'}")
	private String name;
	@Value("#{452507}")
	private int psid;
	@Value("#{42800.00}")
	private double Salary;
	@Value("#{'HSBC'}")
	private String organization_name;
	@Value("#{42800>00}")
	private boolean isactive;
	
	private Address address;
	
	//constructor
	public Employee(String name, int psid, double salary, String organization_name, boolean isactive,Address address) {
		super();
		this.name = name;
		this.psid = psid;
		Salary = salary;
		this.organization_name = organization_name;
		this.isactive = isactive;
		this.address=address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPsid() {
		return psid;
	}

	public void setPsid(int psid) {
		this.psid = psid;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getOrganization_name() {
		return organization_name;
	}

	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		this.address.display();
		return "Employee [name=" + name + ", psid=" + psid + ", Salary=" + Salary + ", organization_name="
				+ organization_name + ", isactive=" + isactive + "]";
	}

	
	
	
	
	
	
	
	
	

}
