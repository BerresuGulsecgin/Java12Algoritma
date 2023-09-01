package lesson012;

import java.util.UUID;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount musteri1 = new BankAccount(UUID.randomUUID().toString(), 1000000); // random string getirir
		System.out.println(musteri1.faizGetirisiHesabı(10));
		musteri1.getInfo();

		BankAccount musteri2 = new BankAccount(UUID.randomUUID().toString(), 50000); // random string getirir
		System.out.println(musteri2.faizGetirisiHesabı(10));
		musteri2.getInfo();

	}

}
