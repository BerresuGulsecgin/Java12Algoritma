package lesson15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

;

public class CustomerManager {
	static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");

	public void register() {

		String userName = Util.getStringValue("kullanıcı adı giriniz");
		String password = Util.getStringValue("şifre giriniz");
		String tc = Util.getStringValue("tc giriniz");
		double balange = Util.getDoubleValue("bakiye yükleyin");

		Customer customer = new Customer(userName, password, tc, balange);
		Main.library.getCustomerList().add(customer);
		System.out.println("kayıt başarılı sisteme hoşgeldiniz" + userName);

	}

	public void Login1() {
		String userName = Util.getStringValue("kullanıcı adı giriniz");
		String password = Util.getStringValue("şifre giriniz");

		for (int i = 0; i < Main.library.getCustomerList().size(); i++) {
			if (Main.library.getCustomerList().get(i).getUsername().equals(userName)
					&& Main.library.getCustomerList().get(i).getPassword().equals(password)) {
				System.out.println("sisteme giriş yapıldı");
			} else {
				System.out.println("önce kayıt olmanı gerekir");
			}
		}
	}

	public Customer login() {
		String username = Util.getStringValue("Kullanıcı Adı Girin:");
		Customer customer = findByUsername(username);
		if (customer != null) {
			for (int i = 3; i > 0; i--) {
				String password = Util.getStringValue("Şifre Girin:");
				if (customer.getPassword().equals(password)) {
					System.out.println("Giriş başarılı");
					return customer;
				} else {
					System.out.println("Şifre yanlış" + (i - 1) + " Kadar hakkınız kaldı");
				}
			}
			// TODO: Hesabı askıya al metodu yazılcak
			System.out.println("Hesabınız askıya alındı");
			return customer;
		} else {
			System.out.println("Kullanıcı Bulanamadıı");
			return customer;
		}

	}

	public void rentBook(Customer customer) {
		Main.serviceImpl.getAllBooks();
		String id = Util.getStringValue("kiralamak istediğiniz ıd ");
		Book book = Main.serviceImpl.findById(id);

		if (book == null) {
			System.out.println("id hatalı");
			return;
		}

		if (book.geteStatus().name().equals("ACTIVE")) {
			if (customer.getBalance() >= book.getPrice()) {
				customer.getRentedBooks().add(book);
				customer.setBalance(customer.getBalance() - book.getPrice());
				book.seteStatus(EStatus.INRENT);
				book.setRentDate(LocalDateTime.now());
				book.setReturnedDate(iadeTarihiBelirle());
				System.out.println("Kitabı iade etmeniz gereken tarih : " + book.getReturnedDate().format(format));
				System.out.println("kitap kiralandı");
			} else {
				System.out.println("bakiye yeterisiz");
			}

		} else {
			System.out.println("kitap aktif değil");
		}

	}

	public void kiralananKitaplarıGoster(Customer customer) {
		if (customer.getRentedBooks().isEmpty()) {
			System.out.println("kiralanan kitap yok");
		} else {
			customer.getRentedBooks().forEach(book -> System.out.println(
					book.getName() + " iade tarihi : " + book.getReturnedDate().format(format) + " " + book.getId()));
		}
	}

	public void iade(Customer customer) {
		kiralananKitaplarıGoster(customer);
		String id = Util.getStringValue("iade yapılacak kitap ıd ");
		Book book = Main.serviceImpl.findById(id);
		if (book == null) {
			System.out.println("id hatalı");
			return;
		}

		if (customer.getRentedBooks().remove(book)) {
			book.seteStatus(EStatus.ACTIVE);
			System.out.println("kitap iade işlemi başarılı");
		} else {
			System.out.println("kiralanan kitaplar arasında böyle bir kitap yok");
		}

	}

	public LocalDateTime iadeTarihiBelirle() {

		int iadeTarihi = Util.getIntValue("kaç gün sonra iade edeceksiniz.");
		LocalDateTime currentDate = LocalDateTime.now();

		LocalDateTime returnedDate = currentDate.plusDays(iadeTarihi);
		return returnedDate;
	}

	private Customer findByUsername(String username) {
		for (Customer customer : Main.library.getCustomerList()) {
			if (customer.getUsername().equals(username)) {
				return customer;
			}
		}
		return null;
	}

}
