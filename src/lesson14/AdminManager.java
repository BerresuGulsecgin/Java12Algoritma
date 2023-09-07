package lesson14;

public class AdminManager {

	public void basvuruOnayla(Account account) {

		if (account.isKrediBasvurusu()) {
			System.out.println("kredi başvurunuz onaylanmıştır");
			account.setMoney(account.getMoney() + account.getIstenenKrediMiktari());
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
			user.getAccount().setMoney(user.getAccount().getMoney() + user.getAccount().getIstenenKrediMiktari());
			user.getAccount().setIstenenKrediMiktari(0);
			user.getAccount().setKrediBasvurusu(false);
		} else {
			System.out
					.println(user.getAccount().getAccountNo() + " numaralı hesap için kredi başvurusu bulunmamaktadır");
		}
	}

}
