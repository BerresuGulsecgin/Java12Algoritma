package lesson14;

public class UserManager {

	public static String generateEmail(String name, String surname) {
		return name + "." + surname + "@xbanka.com";

	}
	
	public void krediBasvurusundaBulun(Account account, double miktar) {
		account.setKrediBasvurusu(true);
		account.setIstenenKrediMiktari(miktar);
		
		System.out.println(miktar+" değerinde kredi başvurunda bulundunuz");
		System.out.println("lütfen onay bekleyin...");
	}

}
