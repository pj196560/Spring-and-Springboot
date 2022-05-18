package com.Standalone_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	
	private List<String> freindlist;
	private Set<Long> phonenumber;
	private Map<String,Integer> coursefees;
	private Properties properties;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> freindlist, Set<Long> phonenumber, Map<String, Integer> coursefees,
			Properties properties) {
		super();
		this.freindlist = freindlist;
		this.phonenumber = phonenumber;
		this.coursefees = coursefees;
		this.properties = properties;
	}

	public List<String> getFreindlist() {
		return freindlist;
	}

	public void setFreindlist(List<String> freindlist) {
		this.freindlist = freindlist;
	}

	public Set<Long> getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Set<Long> phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Map<String, Integer> getCoursefees() {
		return coursefees;
	}

	public void setCoursefees(Map<String, Integer> coursefees) {
		this.coursefees = coursefees;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
	
	
	

}
