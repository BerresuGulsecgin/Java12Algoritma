package lesson15;

import java.util.ArrayList;

public class Library {

	private String name;
	private ArrayList<Book> bookList;
	private ArrayList<Customer> customerList;

	public Library() {
		this.bookList = new ArrayList<Book>();
		this.customerList = new ArrayList<Customer>();
	}

	public Library(String name) {
		this();
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

}
