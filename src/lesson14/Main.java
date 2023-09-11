package lesson14;

import java.time.LocalDateTime;

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

		// krediborcunuöde();
		// dışarıdan nakit olarak ödeyeceğiz
		// max kredi kadar ödeyecek
		// kullanıcın kredisi var mı kontrol et
		// ödeme yapınca kredi borcundan düşülsün
		// güncel borcu göster
		// her borç ödeyince kredi puanı 10 artsın

		// hesaptan ödeme yaparsa

		// userin kredi başvurusu onaylandıktan sonra
		// user a mail atalım

		// user maillerine baklabilecek
		// mailin başlığı içeriği gönderim saatini tut
		// mail gönder(User user) metodu yaz

		// mailgönder(User user) metod yaz
		// başvuru onaylanınca mail 5 sny sonra gitsin

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
		Account account3 = new Account(10000);
		user.setAccount(account3);
		System.out.println(user.getEmail());
		System.out.println(account3.getMoney());

		manager.krediBasvurusundaBulun(account3, 8000);
		admin.basvuruOnayla(account3);
		manager.krediBorcuOde(account3, 2000, false);
		manager.krediBorcuOde(account3, 3000, false);
		System.out.println(account3.getKrediTutarı());
		System.out.println(account3.getKrediNotu());
		System.out.println(account3.getMoney());
		manager.krediBorcuOde(account3, 3000, false);
		System.out.println(account3.getKrediNotu());
		System.out.println(account3.getMoney());

		System.err.println("-------------------------");

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime.getHour() + ":" + dateTime.getMinute());

		System.err.println("-------------------------");

		manager.krediBasvurusundaBulun(account3, 20000);
		try {

			admin.basvuruReddet(user);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(user.getGelenKutusu().get(0).getBaslik());
		System.out.println(user.getGelenKutusu().get(0).getGonderen());
		System.out.println(user.getGelenKutusu().get(0).getIcerik());
		System.out.println(user.getGelenKutusu().get(0).getGonderiSaati());

	}

}
