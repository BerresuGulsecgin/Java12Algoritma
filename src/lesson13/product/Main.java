package lesson13.product;

public class Main {

	public static void main(String[] args) {

		// product sınıfı oluştur
		// gerekli fieldleri yazalım

		// değişkenleri private kullan
		
		//bir product nesnesi oluşunca ıd si otomatik olarak belirlensin
		//1000-10000 arası bir sayı
		//farklı bir paketin içinde yapalım class ismi de RandomGeenerateID olsun

		Product product = new Product();

		product.setName("Asus");
		product.setPrice(15000);
		product.setStock(100);
		
		Product product2 = new Product();
		

		System.out.println(product.getName());
		product.updateName("AsusX");
		System.out.println(product.getName());
		product.saveToDataBase();
		System.out.println(product.getId());
		System.out.println(product2.getId());
		
		product.setStock(-90);
		


	}

}
