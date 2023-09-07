package lesson14;

public class Main {

	public static void main(String[] args) {

		// Account,
		// accountNo;
		// money;

		// paraYatir() hesabımızı bizim belirttiğimiz miktarda para eklensin, max 10000
		// tl yatırsın
		// yatırınca ne kadar yatırdığını ve bakiyesini söyle para çek içinde yap bunu
		// paraCek() belirtlien miktarda para çekilsin max 5000 tl çekebilsin

		// AccountManeger diye bir sınıf oluştur cek ve yatır metodlarını bu sınıfa
		// taşıyalım

		// user sınıfı oluştur.ad, soyad, email, account
		// user oluşturduğumda otomatik olarak email oluştun mehmet yardımcı =
		// mehmet.yardimci@xbanka.com

		// krediBaşvurusunda bulun
		// User kredi başvurusunda bulunsun
		// ama para hemen gelmesin
		// çekmek istediği miktarı, hangihesaba para çekeciğini belirtsin

		// admin onayından sonra para gelecek

		Account account = new Account(1000);
		Account account2 = new Account(2000);

		AccountManager accountManager = new AccountManager();
		UserManager manager = new UserManager();
		AdminManager admin = new AdminManager();

		System.out.println(account.getMoney());
		System.out.println(account2.getMoney());

		accountManager.paraCek(account2, 500);
		accountManager.paraCek(account2, 500);
		System.out.println(account2.getMoney());

		accountManager.hesapBilgileri(account2);

		User user = new User("mehmet", "yardımcı");
		Account account3 = new Account(2000);
		user.setAccount(account3);
		System.out.println(user.getEmail());

		manager.krediBasvurusundaBulun(account3, 10000);
		System.out.println(account.getMoney());
		admin.basvuruReddet(account3);
		System.out.println(account3.getMoney());

	}

}
