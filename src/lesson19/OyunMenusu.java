package lesson19;

import java.util.Scanner;

public class OyunMenusu {

	static Scanner sc = new Scanner(System.in);

	public static void menu() {

		PlakaTahmini plakaTahmin = new PlakaTahmini();

		String message = "Şehir Tahmin Oyununa Hoşgeldiniz\n" + "Oyunumuzda toplam 3 tahmin hakkınız bulunmaktadır.\n"
				+ "1- Oyuna başla \n" + "2- Tahminlerim \n" + "0- Çıkış \n";

		int input;
		do {
			System.out.println("============================");
			System.out.println(plakaTahmin.getOyunSayisi());
			System.out.println(message);

			input = sc.nextInt();
			sc.nextLine();

			switch (input) {
			case 1:
				System.out.println("Oyun başladı");
				plakaTahmin.tahminEt2();

				break;
			case 2:
				System.out.println("geçmiş listem");
				plakaTahmin.tahminListem();
				break;
			case 0:
				System.out.println("çıkış yapıldı");
				System.exit(0);

				break;

			default:
				break;
			}

		} while (true);
	}

}
