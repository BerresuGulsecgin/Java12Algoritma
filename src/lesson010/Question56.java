package lesson010;

import java.util.Scanner;

public class Question56 {

	public static void main(String[] args) {
		// doğum yılını girerek yaşı ve hangi yy da doğduğunu hesapla metodu
		// kullaniciBilgileriniGoster metodunu çağrınca hem hangi yy olduğunu hem de
		// yaşını söyle

		kullaniciBilgileriniGoster();

	}

	public static int yasHesapla(int yil) {
		int yas = 2023 - yil;
		return yas;

	}

	public static int yyHesapla(int yil) {
		int yy = (yil / 100) + 1;
		return yy;

	}

	public static void kullaniciBilgileriniGoster() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hangi yılda doğdunuz");
		int yil = scanner.nextInt();

		int yas = yasHesapla(yil);
		System.out.println("yaşınız = " + yas);
		int yy = yyHesapla(yil);
		System.out.println(yy + ". yüzyılda doğdunuz");
	}

}
