package com.Stereotype_annotation;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book1")
public class Book {
	@Value("#{list1}")
	private List<String> bookname;
	@Value("#{list2}")
	private List<String> price;
	@Value("#{set1}")
	private Set<String> writter;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getBookname() {
		return bookname;
	}
	public void setBookname(List<String> bookname) {
		this.bookname = bookname;
	}
	public List<String> getPrice() {
		return price;
	}
	public void setPrice(List<String> price) {
		this.price = price;
	}
	public Set<String> getWritter() {
		return writter;
	}
	public void setWritter(Set<String> writter) {
		this.writter = writter;
	}
	
	
	

}
