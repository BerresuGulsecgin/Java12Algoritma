package lesson13.product;

import lesson13.utility.RandomGenerateID;

public class Product {

	private String name;
	private String ıd;
	private int stock;
	private double price;
	private String prodocutCode;

	private boolean isActive = true;

	public Product() {
		this.ıd = RandomGenerateID.generateId();

	}

	public Product(String name, int stock, double price) {
		this();
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.prodocutCode = RandomGenerateID.generateProductCode(name);
	}

	public String getProdocutCode() {
		return prodocutCode;
	}

	public void setProdocutCode(String prodocutCode) {
		this.prodocutCode = prodocutCode;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isAvtice) {
		this.isActive = isAvtice;
	}

	public void updateName(String name) {
		setName(name);

	}

	public void saveToDataBase() {
		System.out.println(getName() + " veri tabanına kaydedildi");

	}

	// productın stoğu biterse ürünü gösterimden kaldır

	public void removeFormListing() {
		setActive(false);
		System.out.println(getName() + " gösterimden kaldırıldı");

	}

	public void addToListing() {
		setActive(true);
		System.out.println(getName() + " ürüne stok eklendi");

	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", ıd=" + ıd + ", stock=" + stock + ", price=" + price + ", prodocutCode="
				+ prodocutCode + ", isActive=" + isActive + "]";
	}
	
	

}
