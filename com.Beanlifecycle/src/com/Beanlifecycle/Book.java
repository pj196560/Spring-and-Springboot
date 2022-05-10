package com.Beanlifecycle;

public class Book {
	private String bookname;
	private String author;
	private String isbn;
	private double price;
	private double discount;
	
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "the book name is:: "+this.bookname+"\n"+"and the author is:: "+this.author+"\n"+"ISBN no is::"+this.isbn+"\n"+
	    " actual price of the book is::"+this.price+"\n"+"the 10% discout will be provided::"+((this.price)-((this.price/100)*10));
	}
	
	public void init()
	{
		System.out.println("initilization of code");
	}
	
	public void destroy()
	{
		System.out.println("clean the code");
	}
	
	
	
	
	

}
