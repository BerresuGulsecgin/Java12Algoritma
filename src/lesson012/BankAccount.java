package lesson012;

/*
 * bir interestrate(faiz oranı) acoountnumber(hesap numarası) bir de balance (bakiye) özellliklerimiz olacak
 * 
 * bu sınıfı soyutladıktan sonra banka için bir faiz oranı belirle 0.05 
 * daha sonra faiz getirisini hesaplayan bir metod yaz 
 * bir de getInformation metodu yaz ( hesqap bilgisi yazdırılacak)
 * 
 */

public class BankAccount {

	final static double FAİZ_ORANI = 0.05;
	String hesapNo;
	double bakiye;

	public BankAccount(String hesapNo, double bakiye) {

		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
	}

	public double faizGetirisiHesabı(int gun) {
		double gunlukFaizGetirisi = (bakiye / 100) * (FAİZ_ORANI / 365) * gun;
		return gunlukFaizGetirisi;

	}

	public void getInfo() {
		System.out.println("***************HESAP BİLGİLERİ******************");
		System.out.println("hesap no = " + hesapNo + "\nbakiye = " + bakiye + "\nfazi oranı =" + FAİZ_ORANI
				+ "\nfazi getirisi = " + faizGetirisiHesabı(1));
		System.out.println("************************************************");
	}
}
