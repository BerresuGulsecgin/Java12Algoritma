package lesson14;

public class UserManager {

	public static String generateEmail(String name, String surname) {
		return name + "." + surname + "@xbanka.com";

	}

	public void krediBasvurusundaBulun(Account account, double miktar) {
		account.setKrediBasvurusu(true);
		account.setIstenenKrediMiktari(miktar);

		System.out.println(miktar + " değerinde kredi başvurunda bulundunuz");
		System.out.println("lütfen onay bekleyin...");
	}

	public void krediBorcuOde(Account account, double miktar, boolean isCash) {

		if (isCash) {
			if (account.getKrediTutarı() > 0 && miktar <= account.getKrediTutarı() && miktar != 0) {
				account.setKrediTutarı(account.getKrediTutarı() - miktar);
				System.out.println(miktar + "tl ödeme alınmıştır.Güncel kredi borcunuz : " + account.getKrediTutarı());
				account.setKrediNotu(account.getKrediNotu() + Account.KREDI_PUAN_ARTİS_MİKTARİ);
			}

			else {
				System.out.println("kredi borcunuzunuz üzerinde ya da 0 olamaz");
			}
		} else {
			if (account.getKrediTutarı() > 0 && miktar <= account.getKrediTutarı() && miktar != 0
					&& account.getMoney() >= miktar) {
				account.setKrediTutarı(account.getKrediTutarı() - miktar);
				System.out.println(miktar + "tl ödeme alınmıştır.Güncel kredi borcunuz : " + account.getKrediTutarı());
				account.setKrediNotu(account.getKrediNotu() + Account.KREDI_PUAN_ARTİS_MİKTARİ);
				account.setMoney(account.getMoney() - miktar);
			} else if (account.getMoney() < miktar) {
				System.out.println("bakiye yetersiz");
			} else {
				System.out.println("kredi borcunuzunuz üzerinde ya da 0 olamaz");
			}

		}

	}

}
