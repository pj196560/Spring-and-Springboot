package autowire_through_xml;

public class Employee {
	
	private String name;
	private String empid;
	private String company_name;
	private Address address;
	
	
	//Constructor
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String name, String empid, String company_name, Address address) {
		super();
		this.name = name;
		this.empid = empid;
		this.company_name = company_name;
		this.address = address;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String toString()
	{
		return "the name of employe is "+ this.name+" "+"his empid "+this.empid+" "+ "and his company name is "+this.company_name+" "
				+"company adress is "+this.address;
		
	}
	
	
	
	
	
	
	
	
	

}
