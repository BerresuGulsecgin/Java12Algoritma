package lesson15;

public class LibraryServiceImpl implements ILibraryService {

	@Override
	public void createBook() {
		String bookName = Util.getStringValue("kitap ismini giriniz");
		String authorName = Util.getStringValue("yazar ismini giriniz");
		String publisher = Util.getStringValue("yayınevi ismini giriniz");
		double price = Util.getDoubleValue("kitap ücretini giriniz");

		String categoryName = Util.getStringValue("kitabın kategorsini giriniz");
		Category category = new Category(categoryName);

		Book book = new Book(bookName, authorName, publisher, price, category);

		Main.library.getBookList().add(book);
		System.out.println(bookName + " sisteme eklendi");

	}

	@Override
	public void getAllBooks() { // tamamen görsellik foreach(Book book : Main.library.getBookList()) ile yazdır
								// geç

		String list = "No\tName\t\tAuthorName\tCategory\tEStatus\t\tPrice\t\tID\n";
		int index = 1;
		for (int i = 0; i < Main.library.getBookList().size(); i++) {
			list += index + ".\t" + Main.library.getBookList().get(i).getName() + "\t\t"
					+ Main.library.getBookList().get(i).getAuthorName() + "\t\t"
					+ Main.library.getBookList().get(i).getCategory().getName() + "\t\t"
					+ Main.library.getBookList().get(i).geteStatus() + "\t\t"
					+ Main.library.getBookList().get(i).getPrice() + "\t\t" + Main.library.getBookList().get(i).getId()
					+ "\n";
			index++;
		}
		System.out.print(list);

	}

	@Override
	public void getAllBooksByActive() {

		Main.library.getBookList().forEach(product -> System.out.println(product.getId()));
		String list = "No\tName\t\tAuthorName\tCategory\tPrice\n";
		int index = 1;
		for (int i = 0; i < Main.library.getBookList().size(); i++) {
			if (Main.library.getBookList().get(i).geteStatus().equals(EStatus.ACTIVE)) {
				list += index + ".\t" + Main.library.getBookList().get(i).getName() + "\t\t"
						+ Main.library.getBookList().get(i).getAuthorName() + "\t\t"
						+ Main.library.getBookList().get(i).getCategory().getName() + "\t\t"
						+ Main.library.getBookList().get(i).getPrice() + "\n";
				index++;
			}
		}

		System.out.print(list);

	}

	@Override
	public void getAuthorByName() {

		String authorName = Util.getStringValue("yazar ismini giriniz");
		System.out.println(authorName + "adlı yazarın kitapları ");
		int index = 1;
		for (int i = 0; i < Main.library.getBookList().size(); i++) {
			if (Main.library.getBookList().get(i).getAuthorName().equalsIgnoreCase(authorName)) {
				System.out.println(index + "-" + Main.library.getBookList().get(i).getName());
				i++;
			}

		}
		if (index == 1) {
			System.out.println("aradığınız yazarın kitabı bulunamadı");
		}

	}

	@Override
	public void deleteBookById() {

		Main.library.getBookList().forEach(product -> System.out.println(product.getId()));

		String ıd = Util.getStringValue("silmek istediğini ıd");
		for (int i = 0; i < Main.library.getBookList().size(); i++) {
			if (Main.library.getBookList().get(i).getId().equals(ıd)) {
				System.out.println(Main.library.getBookList().get(i).getName() + " adlı kitap silindi");
				Main.library.getBookList().remove(i);

				return;
			}
		}
		System.out.println("bu ıd ye ait kitap yok");

	}

	@Override
	public void changeStatusToDeleted(String id) {
		Book book = findById(id);
		if (book != null) {
			book.seteStatus(EStatus.DELETED);
		} else {
			System.out.println("silmek istediğiniz ıd de kitap bulunamadı");
		}

	}

	private Book findById(String id) {
		for (Book book : Main.library.getBookList()) {
			if (book.getId().equals(id)) {
				return book;
			}
		}
		return null;

	}

	@Override
	public void applyDiscount(String id, int tutar) {

		Book book = findById(id);

		if (book != null) {
			book.setPrice(book.getPrice() - tutar);
		}else {
			System.out.println("kitap bulunamadı");
		}

	}

}
