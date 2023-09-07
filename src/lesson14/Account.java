package lesson14;

import java.util.Random;

public class Account {

	private String accountNo;
	private double money;
	
	private boolean krediBasvurusu;
	private double istenenKrediMiktari;

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
	private String randomAcountNo() {
		int number = rnd.nextInt(1000, 1000000);
		String acountNo = Integer.toString(number);
		return acountNo;

	}

	
}
