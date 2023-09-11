package lesson14;

import java.time.LocalDateTime;

public class AdminManager {

	public void basvuruOnayla(Account account) {

		if (account.isKrediBasvurusu()) {
			System.out.println("kredi başvurunuz onaylanmıştır");
			account.setMoney(account.getMoney() + account.getIstenenKrediMiktari());
			account.setKrediTutarı(account.getIstenenKrediMiktari());
			account.setIstenenKrediMiktari(0);
			account.setKrediBasvurusu(false);

		} else {
			System.out.println(account.getAccountNo() + " numaralı hesap için kredi başvurusu bulunmamaktadır");
		}
	}

	public void basvuruReddet(Account account) {

		if (account.isKrediBasvurusu()) {
			System.out.println("kredi başvurunuz reddedildi");
			account.setIstenenKrediMiktari(0);
			account.setKrediBasvurusu(false);
		} else {
			System.out.println(account.getAccountNo() + " numaralı hesap için kredi başvurusu bulunmamaktadır");
		}
	}

	public void basvuruOnayla(User user) {

		if (user.getAccount().isKrediBasvurusu()) {
			System.out.println("kredi başvurunuz onaylanmıştır");
			mailGonder(user, user.getAccount().getIstenenKrediMiktari() + "tl başvurunuz onaylandı");
			user.getAccount().setMoney(user.getAccount().getMoney() + user.getAccount().getIstenenKrediMiktari());
			user.getAccount().setIstenenKrediMiktari(0);
			user.getAccount().setKrediBasvurusu(false);

		} else {
			System.out
					.println(user.getAccount().getAccountNo() + " numaralı hesap için kredi başvurusu bulunmamaktadır");
		}
	}

	public void basvuruReddet(User user) throws InterruptedException {

		if (user.getAccount().isKrediBasvurusu()) {

			Thread.sleep(5000);
			mailGonder(user, user.getAccount().getIstenenKrediMiktari() + "tl başvurunuz reddedildi");

			user.getAccount().setIstenenKrediMiktari(0);
			user.getAccount().setKrediBasvurusu(false);

		} else {
			System.out
					.println(user.getAccount().getAccountNo() + " numaralı hesap için kredi başvurusu bulunmamaktadır");
		}
	}

	public void mailGonder(User user, String mesaj) {
		Mail mail = new Mail();
		mail.setBaslik("kredi başvurusu hakkında");
		mail.setIcerik(mesaj);
		user.getGelenKutusu().add(mail);

	}

}
