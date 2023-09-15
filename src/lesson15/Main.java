package lesson15;

public class Main {

	static Library library = new Library("milli kütüphane");
	static CustomerManager customerManager = new CustomerManager();
	static LibraryServiceImpl serviceImpl = new LibraryServiceImpl();

	public static void main(String[] args) {

		Main.library.getBookList().add(new Book("XKitabı", "Ali", "AYayın", 150, new Category("Polisiye")));
		Main.library.getBookList().add(new Book("YKitabı", "Ali", "BYayın", 200, new Category("Roman")));
		Main.library.getBookList().add(new Book("ZKitabı", "Ayşe", "CYayın", 300, new Category("Öykü")));
		Main.library.getBookList().add(new Book("DKitabı", "Mehmet", "DYayın", 350, new Category("Hikaye")));

		// Util sınıfı açalım
		// burada 2 tane metod yazalım
		// String değer al()
		// doubledeğeral()

		//

		// menü yapalım
		// 1 sisteme kitap ekle
		// 2 tüm kitapları listele getAllBooks
		// 3 avtice kitaplarını listele getAllBooksByActive
		// 4 yazar ismine göre arama yap getAuthorByName
		// 5 deleteBookById ıdye göre önce ıd ve isim yazdır
		// 6 - changeStatusToDeleted,
		// 7 - indirim uygula

		librarySytemMenu();

		// 1 admin girişi AdminLoginPage
		// 2 user girişi UserPage
		// User page ya register ol ya login yap
		// admin login de login olsun sadece
		// admin login olunca systemMenu()
		// user register olunca userPage atsın login olsun sonra userMenu

		//

	}

	public static void systemMenu() {

		while (true) {
			String id = "";
			System.out.println("1- Sisteme kitap ekle");
			System.out.println("2- kitapları listele");
			System.out.println("3- aktif kitapları listele");
			System.out.println("4- yazar adına göre kitap arama");
			System.out.println("5- ıd ye göre silme işlemi");
			System.out.println("6 - Statusunu değiştir");
			System.out.println("7 - indirim uygula");
			System.out.println("0 - LogOut");
			int secim = Util.getIntValue("seçim giriniz");

			switch (secim) {
			case 1:
				serviceImpl.createBook();
				break;
			case 2:
				serviceImpl.getAllBooks();
				break;
			case 3:
				serviceImpl.getAllBooksByActive();
				break;
			case 4:
				serviceImpl.getAuthorByName();
				break;
			case 5:
				serviceImpl.deleteBookById();
				break;
			case 6:
				serviceImpl.getAllBooks();
				id = Util.getStringValue("silmek istediğin kitap ıdsi giriniz");
				serviceImpl.changeStatusToDeleted(id);
				break;
			case 7:
				serviceImpl.getAllBooks();
				id = Util.getStringValue("indirim uygulamak istediğiniz kitap ıdsi giriniz");
				int tutar = Util.getIntValue("indirim tutarını giriniz");
				serviceImpl.applyDiscount(id, tutar);
				break;

			case 0:
				librarySytemMenu();
				break;

			default:
				break;
			}
		}

	}

	public static void librarySytemMenu() {
		System.out.println("1 Admin girişi");
		System.out.println("2 User işlemleri");
		System.out.println("0 Sistemi kapat");

		while (true) {
			int secim = Util.getIntValue("seçim giriniz");
			switch (secim) {
			case 1:
				System.out.println("AdminLoginPage");
				systemMenu();
				break;
			case 2:
				userPage();
				break;
			case 0:
				System.out.println("sistem kapandı");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	public static void userPage() {

		while (true) {
			System.out.println("1 Register");
			System.out.println("2 Login");
			System.out.println("0 Sistemi kapat");
			int secim = Util.getIntValue("seçim giriniz");

			switch (secim) {
			case 1:

				customerManager.register();

				break;
			case 2:
				Customer customer = customerManager.login();
				if (customer != null) {
					userApplication(customer);
				}

				break;
			case 0:
				System.out.println("sistem kapandı");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	public static void userApplication(Customer customer) {

		while (true) {
			System.out.println("Hoşgeldiniz" + customer.getUsername());
			System.out.println("1 kitap kirala");
			System.out.println("2 kiralanan kitapları listele");
			System.out.println("3 kitap iade");
			System.out.println("0 Sistemi kapat");

			int secim = Util.getIntValue("seçim giriniz");
			String id;

			switch (secim) {
			case 1:

				customerManager.rentBook(customer);

				break;
			case 2:
				customerManager.kiralananKitaplarıGoster(customer);

				break;
			case 3:
				customerManager.iade(customer);

				break;

			case 0:
				System.out.println("sistem kapandı");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

}
