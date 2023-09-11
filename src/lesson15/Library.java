package lesson15;

import java.util.ArrayList;

public class Library {
	
	private String name;
	private ArrayList<Book> bookList;
	
	
	
	
	public Library() {
		this.bookList=new ArrayList<Book>();
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
	
	

}
