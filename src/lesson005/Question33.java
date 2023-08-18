package lesson005;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {

		// doğru format mail girene kadar devam ettir
		// hotmail ve outlook kabul et
		// şifreler uyuşmaz ve ya 8 den küçükse uyarı verdir
		
		//@hotmail.com@hotmail.com girilince hata vermiyo sorunu varbunu çöz

		Scanner sc = new Scanner(System.in);
		boolean x = true;

		System.out.println("mail girin");
		String mail = sc.next();

		String format1 = "@hotmail.com";
		String format2 = "@outlook.com";

		while (x) {  

			if (mail.substring((mail.length() - 12)).equals(format1)
					|| mail.substring((mail.length() - 12)).equals(format2)) {
				System.out.println("şifrenizi giriniz");
				String sifre = sc.next();
				System.out.println(" şifrenizi yeniden  giriniz");
				String sifre2 = sc.next();
				if (sifre.equals(sifre2) && sifre.length() >= 8) {
					System.out.println("kayıt başarılı");
					x = false;

				} else
					System.out.println("şifreler uyuşmuyor ya da 8 den küçük");

			} else {
				System.out.println("mail hatalı yeniden giriniz");
				mail = sc.next();

			}
		}

	}

}
