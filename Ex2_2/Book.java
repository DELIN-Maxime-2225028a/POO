package exDeuxPointDeuxTP3;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;


	public Book(String name, Author[] authors, double price) { 
		this.name = name;
		this.authors = authors;
		this.price = price;
		qty = 0;
	}

	public Book(String name, Author[] authors, double price, int qty) { 
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name; 
	}
	
	public Author[] getAuthors() {
		return authors; 
	}
	
	public double getPrice() {
		return price; 
	}
	
	public int getQty() {
		return qty;
	}

	public String getAuthorNames() {
		String authorNames = "";
		for (int i = 0; i < authors.length; ++i) {
			authorNames += authors[i] + " ";
		}
		return authorNames;
	}
	
	public void setPrice(double price) {
		this.price = price; 
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		String authorsToString = "";
		for (int i = 0; i < authors.length -1; ++i) {
			authorsToString += authors[i].toString() + ", ";
		}
		authorsToString += authors[authors.length -1].toString() ;
		return "Book[name= " + getName() + ", authors={" + authorsToString + "}" + ", price= " + getPrice() + ", qty= " + getQty() + " ]";
	}
}
