package lesson15;

public class CustomerManager {

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

	private Customer findByUsername(String username) {
		for (Customer customer : Main.library.getCustomerList()) {
			if (customer.getUsername().equals(username)) {
				return customer;
			}
		}
		return null;
	}

}
