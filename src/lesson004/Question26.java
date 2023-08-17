package lesson004;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// kullanıcıdan taban ve üst iste
		// 2 üzeri5i hesapla gibi

		Scanner sc = new Scanner(System.in);

		System.out.println("taban sayı giriniz");
		int taban = sc.nextInt();

		System.out.println("üst sayı giriniz");
		int ust = sc.nextInt();

		int sonuc = 1;
		for (int i = 1; i <= ust; i++) {
			sonuc = sonuc * taban;

		}
		System.out.println(taban + " ^ " + ust + " = " + sonuc);
	}
}
