package lesson13.product;

import lesson13.utility.RandomGenerateID;

public class Product {

	private String name;
	private String ıd;
	private int stock;
	private double price;
	private String pdocutCode;

	public Product() {
		this.ıd = RandomGenerateID.generateId();

	}

	public Product(String name, int stock, double price) {
		this();
		this.name = name;
		this.stock = stock;
		this.price = price;
	}

	public String getPdocutCode() {
		return pdocutCode;
	}

	public void setPdocutCode(String pdocutCode) {
		this.pdocutCode = pdocutCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return ıd;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock < 0) {
			System.out.println("stok sıfırdan az olamaz");
		} else {
			this.stock = stock;
		}

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("price sıfırdan az olamaz");
		} else {
			this.price = price;
		}
	}

	public void updateName(String name) {
		setName(name);

	}

	public void saveToDataBase() {
		System.out.println(getName() + " veri tabanına kaydedildi");

	}

}
