package exDeuxPointUnTP3;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty;


	public Book(String name, Author author, double price) { 
		this.name = name;
		this.author = author;
		this.price = price;
		qty = 0;
	}

	public Book(String name, Author author, double price, int qty) { 
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name; 
	}
	
	public Author getAuthor() {
		return author; 
	}
	
	public double getPrice() {
		return price; 
	}
	
	public int getQty() {
		return qty;
	}

	public void setPrice(double price) {
		this.price = price; 
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return "Book[name= " + getName() + ", " + getAuthor().toString() + ", price= " + getPrice() + ", qty= " + getQty() + " ]";
	}
}
