package lesson26;

import lesson15.Util;

public class Main {

	static OgrenciManager ogrenciManager = new OgrenciManager();

	public static void main(String[] args) {

		SinavSistemi sinavSistemi = new SinavSistemi();
		sinavSistemi.soruDosyasiniOku("Sorular.txt");

		// SinavSistemi.sorular.forEach(Soru::soruyuGoster);

		userPage();

	}

	public static void userPage() {
		while (true) {
			System.out.println("1- Register");
			System.out.println("2- Login");
			System.out.println("0- Sistemi Kapat");
			int secim =0;//= Util.getIntegerValue("Seçiminizi girin");
			switch (secim) {
			case 1:
				ogrenciManager.register();
				break;
			case 2:
				Ogrenci ogrenci = ogrenciManager.login();
				sınavSistemine(ogrenci);

				break;
			case 0:
				System.out.println("Sistem kapandı");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	private static void sınavSistemine(Ogrenci ogrenci) {
		while (true) {
			System.out.println("1- Sınavı Başlat");
			System.out.println("2- Öğrencilerin notlarını Göster ");
			System.out.println("3- Üst Menü ");
			System.out.println("0- Sistemi Kapat");
			int secim =0;//= Util.getIntegerValue("Seçiminizi girin");
			switch (secim) {
			case 1:
				SinavSistemi.sinaviBaslat(ogrenci);
				userPage();
				break;

			case 2:
				SinavSistemi.ogrenciSinavlariniGoster();
				break;
			case 3:
				return;
			case 0:
				System.out.println("Sistem kapandı");
				System.exit(0);
				break;
			default:
				break;
			}
		}

	}

}
