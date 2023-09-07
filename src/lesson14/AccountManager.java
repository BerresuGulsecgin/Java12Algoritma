package lesson14;

public class AccountManager {

	public void paraYatir(Account account, double miktar) {
		if (miktar <= 10000 && miktar > 0) {
			account.setMoney(account.getMoney() + miktar);
			System.out.println(miktar + " TL para yatırıldı.Güncel bakiyeniz : " + account.getMoney());
		} else {
			System.err.println("max 10000 yatırılabilir");
		}

	}

	public void paraCek(Account account, double miktar) {
		if (miktar <= 5000) {
			if (miktar <= account.getMoney()) {
				account.setMoney(account.getMoney() - miktar);
				System.out.println(miktar + " TL para çekildi.Güncel bakiyeniz : " + account.getMoney());
			} else {
				System.out.println("bakiye yetersiz");
			}

		} else {
			System.err.println("max 5000 çekilebilir");
		}

	}
	
	public void hesapBilgileri(Account account) {
		
		System.out.println("HesapNo : "+account.getAccountNo()+" Güncel bakiye : "+account.getMoney());
		
	}

}
