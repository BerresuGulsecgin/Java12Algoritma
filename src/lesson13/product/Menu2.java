package lesson13.product;

import java.util.Scanner;

public class Menu2 {

	static Scanner sc = new Scanner(System.in);
	static Cart cart = new Cart();

	public static void menu() {

		int election;

		do {
			showScreen();
			System.out.print("Seçiminizi girin: ");
			election = sc.nextInt();
			sc.nextLine();

			switch (election) {
			case 1:
				addProduct();
				break;
			case 2:
				listAllProductByActive();
				break;
			case 3:
				addToCart();
				break;
			case 4:
				findByProductCodeFromDataBase();
				break;
			case 0:
				System.out.println("Program kapandı");
				break;

			default:
				break;
			}

		} while (election != 0);

	}

	public static void showScreen() {
		System.out.println("1- Ürün ekle");
		System.out.println("2- Ürünleri listele");
		System.out.println("3- Sepete ekle");
		System.out.println("4- Ürün Koduna Göre Arama Yap");
		System.out.println("0- Çıkış");
		// 5 gösterimden kaldır
		// 6 user sınıfı olsun, sepeti olsun, bakiyesi olsun,
		// 7 user sepete ürün ekleyebilsin
		// 8 user ödeme yapsın (seper boşalsın, bütçe düşsün,)
		// 9 user sepetten ürün çıkarabilsin
	}

	public static Product addProduct() {
		System.out.println("Ürün adı: ");
		String urunAdi = sc.nextLine();

		System.out.println("Ürün stoku: ");
		int stock = sc.nextInt();

		System.out.println("Ürün fiyatı: ");
		double price = sc.nextDouble();

		Product product = new Product(urunAdi, stock, price);

		System.out.println("Ürün başarıyla eklendi ");
		DataBase.getDataBase().add(product);
		sc.nextLine();

		return product;
	}

	public static void listAllProductByActive() {
		String list = "No\tID\t\tName\t\tStock\t\tPrice\n";
		int index = 1;
		for (int i = 0; i < DataBase.getDataBase().size(); i++) {
			if (DataBase.getDataBase().get(i).isActive()) {

				list += index + ".\t" + DataBase.getDataBase().get(i).getId() + "\t\t"
						+ DataBase.getDataBase().get(i).getName() + "\t\t" + DataBase.getDataBase().get(i).getStock()
						+ "\t\t" + DataBase.getDataBase().get(i).getPrice() + "\t\t"
						+ DataBase.getDataBase().get(i).getProdocutCode() + "\n";
				index++;
			}
		}
		System.out.print(list);
	}

	public static void addToCart() {
		listAllProductByActive();

		System.out.println("sepete neyi ekleyelim");
		String productId = sc.nextLine();

		for (Product product : DataBase.getDataBase()) {
			if (product.getId().equals(productId)) {
				cart.addToCart(product);
				return;
			}
		}
		System.out.println(ErrorMessage.NOT_FOUND_PRODUCT);
	}

	public static void findByProductCodeFromDataBase() {
		System.out.println("hangi üsürünü aramak istersiniz");
		String productCode = sc.nextLine();

		for (Product product : DataBase.getDataBase()) {
			if (product.getProdocutCode().equalsIgnoreCase(productCode)) {
				System.out.println(product.toString());
				return;
			}
		}
		System.out.println(ErrorMessage.NOT_FOUND_PRODUCT);

	}

}
