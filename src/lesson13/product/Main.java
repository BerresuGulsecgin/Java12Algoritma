package lesson13.product;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static DataBase dataBase = new DataBase();

	public static void main(String[] args) {

		// product sınıfı oluştur
		// gerekli fieldleri yazalım

		// değişkenleri private kullan

		// bir product nesnesi oluşunca ıd si otomatik olarak belirlensin
		// 1000-10000 arası bir sayı
		// farklı bir paketin içinde yapalım class ismi de RandomGeenerateID olsun

//		Product product = new Product();
//
//		product.setName("Asus");
//		product.setPrice(15000);
//		product.setStock(100);
//
//		Product product2 = new Product("Apple", 150, 1900);
//
//		System.out.println(product.getName());
//		product.updateName("AsusX");
//		System.out.println(product.getName());
//		product.saveToDataBase();
//		System.out.println(product.getId());
//		System.out.println(product2.getId());
//
//		product.setStock(-90);
//
//		System.err.println(product2.getProdocutCode());
//
//		System.err.println("----------------------------------------");
//
//		// sepet sınıfı yap
//		// productlar, amount(adet), totalPrize
//
//		Product product3 = new Product("Apple", 2, 200);
//		Product product4 = new Product("Assus", 40, 100);
//		Product product5 = new Product("Lenova", 30, 300);
//
//		Cart cart1 = new Cart();
//
//		System.out.println(cart1.getAmount());
//		System.out.println(cart1.getTotalPrice());
//
//		System.out.println(product3.isActive());
//
//		cart1.addToCart(product3);
//		cart1.addToCart(product3);
//		cart1.addToCart(product3);
//
//		System.out.println(product);
//
//		System.out.println(cart1.getAmount());
//		System.out.println(cart1.getTotalPrice());
//
//		System.err.println("----------------------------------------");
//
//		cart1.showCartList();
//		
//		System.err.println("----------------------------------------");
//
//		Product yeniEklenen = addProduct();
//		cart1.addToCart(yeniEklenen);
//
//		System.out.println(cart1.getAmount());
//		System.out.println(cart1.getTotalPrice());
		
		
		///menü oluştur
		//1 product ekle
		//2 tüm ürünleri listele isim stock prize ıd(tüm ürünleri listelerken sadece isActive true olanları listele
		//3 sepete ürünekle --> benden ıd istesin kullanıcının girdiği ıd de ürün varsa sepete eklesin
		//4 databasede productCoda göre arama ürün var ise tüm özelliklerini göstersin
		//0 çıkış
		// Menu menu = new Menu();
		//menu.menu() ile mainde çağırırız
		
		addProduct();
		addProduct();
		addProduct();
		
		for (Product product : DataBase.getDataBase()) {
			System.out.println(product.getName());
		}

	}
	// product ekle metodu yazalım

	public static Product addProduct() {

		Product product = new Product();

		System.out.println("ürün adı");
		product.setName(sc.next());
		System.out.println("ürün adedi");
		product.setStock(sc.nextInt());
		System.out.println("ürün fiyatı");
		product.setPrice(sc.nextDouble());

		System.out.println("ürün eklendi");
		

		DataBase.getDataBase().add(product);

		return product;
	}

	public static Product addProduct2() {

		System.out.println("ürün adı");
		String ad = sc.next();
		System.out.println("ürün adedi");
		int adet = sc.nextInt();
		System.out.println("ürün fiyatı");
		int fiyat = sc.nextInt();

		Product product = new Product(ad, adet, fiyat);
		System.out.println("ürün eklendi");
		
		DataBase.getDataBase().add(product);
		
		return product;
	}

}
