package lesson22Twitter;



public class Main {

	static UserManagerImpl managerImpl = new UserManagerImpl();

	// TODO: takipEt, User Engelle +, Profili Goster +

	// Engelle --> tweetlerini göremicez
	// sadece takip ettiklerine mesaj atabilsin
	// customException ekleriz

	public static void main(String[] args) {
		User user = new User("mehmet", "Abc123@", "3125554747");
		User user2 = new User("ahmet", "Abc123@", "3125554111");
		Database.userList.add(user);
		Database.personList.add(user);
		Database.userList.add(user2);
		Database.personList.add(user2);
		TweeterSystemMenu();

	}

	// register olan kullancıları text dosyasına atalım
	// program başladıgındada text yazılan değerler ile nesnelero luşturup ilgili
	// database kaydedlim
	public static void TweeterSystemMenu() {
		while (true) {
			System.out.println("1-Login");
			System.out.println("2- Register");
			System.out.println("0- Sistemi Kapat");
			int secim = Util.getIntegerValue("Seçiminizi girin");
			switch (secim) {
			case 1:
				try {
					Person person = managerImpl.login();
					if (person instanceof User) {
						userPage((User) person);
					} else {
						adminPage();
					}
				} catch (IndexOutOfBoundsException e) {
					System.err.println(" Not Found Exception --> " + e.getMessage());
				}
				break;
			case 2:
				managerImpl.register();
				System.out.println("Kayıt Başarılı Login yapabilirsiniz!!");
				break;
			case 0:
				System.out.println("Sistem kapandı");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	public static void userPage(User user) {
		while (true) {
			System.out.println("1- Tweet At");
			System.out.println("2- Tweet Göster");
			System.out.println("3- Tweet Sil ");
			System.out.println("4- Tweet Begen ");
			System.out.println("5- Yorum Yap");
			System.out.println("6- Mesaj Gonder");
			System.out.println("7- Gelen Kutusu");
			System.out.println("8- Mesajları kısıtla");
			System.out.println("9- Profil Goster");
			System.out.println("10- Üst Menüye Git");
			System.out.println("11- User Engelle");
			System.out.println("0- Sistemi Kapat");
			int secim = Util.getIntegerValue("Seçiminizi girin");
			switch (secim) {
			case 1:
				managerImpl.tweetAt(user);
				break;
			case 2:
				managerImpl.tweetlerimiGoster(user);
				break;
			case 3:
				managerImpl.tweetSil(user);
				break;
			case 4:
				managerImpl.tweetBegen(user);
				break;
			case 5:
				managerImpl.tweeteYorumYap(user);
			case 6:
				managerImpl.mesajGonder(user);
				break;
			case 7:
				managerImpl.gelenKutusu(user);
				break;
			case 8:
				managerImpl.mesajIstekleriniKitle(user);
				break;
			case 9:
				managerImpl.profilGoster(user);
				break;
			case 10:
				System.out.println("Üst Menüye Dön");
				return;
			case 11:
				managerImpl.userEngelle(user);
				break;
			case 0:
				System.out.println("Sistem kapandı");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	public static void adminPage() {
		while (true) {
			System.out.println("Hoşgeldiniz Admin Sayfası");
			int secim = Util.getIntegerValue("Seçiminizi girin");
			String id;
			switch (secim) {
			case 1:
				System.out.println("Admin Sayfası");
				break;
			case 0:
				System.out.println("Sistem kapandı");
				System.exit(0);
				break;
			case 9:
				System.out.println("Üst Menüye Dön");
				return;
			default:
				break;
			}
		}
	}
}