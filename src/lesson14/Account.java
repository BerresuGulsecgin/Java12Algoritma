package lesson14;

import java.util.Random;

public class Account {

	private String accountNo;
	private double money;
	
	private boolean krediBasvurusu;
	private double istenenKrediMiktari;
	private double krediTutarı;
	private int krediNotu;
	
	public static final int KREDI_PUAN_ARTİS_MİKTARİ=10;

	Random rnd = new Random();

	public Account(double money) {

		super();
		this.accountNo = randomAcountNo();
		this.money = money;
	}
	public Account() {

		super();
		this.accountNo = randomAcountNo();
		this.money = money;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}
	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}
	
	
	public double getIstenenKrediMiktari() {
		return istenenKrediMiktari;
	}
	public void setIstenenKrediMiktari(double istenenKrediMiktari) {
		this.istenenKrediMiktari = istenenKrediMiktari;
	}
	
	
	public double getKrediTutarı() {
		return krediTutarı;
	}
	public void setKrediTutarı(double krediTutarı) {
		this.krediTutarı = krediTutarı;
	}
	
	
	public int getKrediNotu() {
		return krediNotu;
	}
	public void setKrediNotu(int krediNotu) {
		this.krediNotu = krediNotu;
	}
	
	
	public static int getKrediPuanArtisMiktari() {
		return KREDI_PUAN_ARTİS_MİKTARİ;
	}
	private String randomAcountNo() {
		int number = rnd.nextInt(1000, 1000000);
		String acountNo = Integer.toString(number);
		return acountNo;

	}

	
}
