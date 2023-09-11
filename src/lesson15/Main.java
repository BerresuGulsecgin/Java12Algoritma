package lesson15;

public class Main {

	static Library library = new Library("milli kütüphane");

	public static void main(String[] args) {

		Main.library.getBookList().add(new Book("XKitabı", "Ali", "AYayın", 150, new Category("Polisiye")));
		Main.library.getBookList().add(new Book("YKitabı", "Ali", "BYayın", 200, new Category("Roman")));
		Main.library.getBookList().add(new Book("ZKitabı", "Ayşe", "CYayın", 300, new Category("Öykü")));
		Main.library.getBookList().add(new Book("DKitabı", "Mehmet", "DYayın", 350, new Category("Hikaye")));

		// Util sınıfı açalım
		// burada 2 tane metod yazalım
		// String değer al()
		// doubledeğeral()

		// menü yapalım
		// 1 sisteme kitap ekle
		// 2 tüm kitapları listele getAllBooks
		// 3 avtice kitaplarını listele getAllBooksByActive
		// 4 yazar ismine göre arama yap getAuthorByName
		// 5 deleteBookById ıdye göre önce ıd ve isim yazdır

		 
		

		systemMenu();

		System.err.println(library.getBookList());

	}

	public static void systemMenu() {

		LibraryServiceImpl serviceImpl = new LibraryServiceImpl();
		while (true) {
			System.out.println("1- Sisteme kitap ekle");
			System.out.println("2- kitapları listele");
			System.out.println("3- aktif kitapları listele");
			System.out.println("4- yazar adına göre kitap arama");
			System.out.println("5- ıd ye göre silme işlemi");
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

			case 0:
				System.out.println("programdan çıktınız");
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}

}
