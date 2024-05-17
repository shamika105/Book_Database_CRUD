package com.pojo;

public class Book {
	private int Bookid;
	private String name;
	private String Author;
	private double price;
	
	public Book() {
		super();
	}

	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Book(int bookid, String name, String author, double price) {
		super();
		Bookid = bookid;
		this.name = name;
		Author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", name=" + name + ", Author=" + Author + ", price=" + price + "]";
	}
	

}
