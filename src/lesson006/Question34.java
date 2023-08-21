package lesson006;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {

		// girilen kelimenin harfini saydır ve hangi indexte ise yazdır

		Scanner scanner = new Scanner(System.in);

		boolean kontrol = true;
		while (kontrol) {
			System.out.println("====String işlemleri====");
			System.out.println("1- Harf Saydırma");
			System.out.println("2- Harf Değiştirme");
			System.out.println("3- Polindrom kontrol");
			System.out.println("4- kelime harfleri arasına ? koy");
			System.out.println("5- kelimenin ilk3 indexini al gerisine ...");
			System.out.println("6- kelimenin ilk 3 harfi al gerisine harf saysı kadar . koy");

			System.out.println("0- Çıkış");

			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				int sayac = 0;
				String index = "";
				System.out.println("Kelime giriniz:");
				String kelime = scanner.next();

				System.out.println("Hangi harfi saymak istiyosunuz ");
				String harf = scanner.next();

				if (!kelime.contains(harf)) {
					System.out.println("Aradıgınız harf kelimede yoktur");
				} else {
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							index += i + ",";
						}
					}

					System.out.println(harf + " harfi kelime içinde " + sayac + " adet bulunuyor");
					System.out.println(harf + " değerinin indexleri ==> " + index.substring(0, index.length() - 1));
				}
				break;
			case 2:
				System.out.println("Kelime giriniz:");
				kelime = scanner.next();

				System.out.println("Hangi harfi değiştirmek istiyosunuz ");
				harf = scanner.next();

				System.out.println("Hangi harf ile değiştirmek istiyosunuz ");
				String harf1 = scanner.next();

				if (!kelime.contains(harf)) {
					System.out.println("Aradıgınız harf kelimede yoktur");
				} else {

					kelime = kelime.replace(harf, harf1);

				}
				System.out.println(kelime);
				break;

			case 3:
				System.out.println("Kelime giriniz:");
				kelime = scanner.next();
				String tersi = "";
				for (int i = 0; i < kelime.length(); i++) {
					tersi = kelime.charAt(i) + tersi;

				}
				if (kelime.equals(tersi)) {
					System.out.println("polindrom");

				} else
					System.out.println("polindrom değil");
				break;

			case 4:

				System.out.println("Kelime giriniz:");
				kelime = scanner.next();
				String newKelime = "";

				for (int i = 0; i < kelime.length(); i++) {
					newKelime = newKelime + kelime.charAt(i) + "?";

				}
				System.out.println(newKelime.substring(0, newKelime.length() - 1));
				break;

			case 5:

				System.out.println("Kelime giriniz:");
				kelime = scanner.next();
				String eksik = "";

				for (int i = 0; i < 3; i++) {
					eksik = eksik + kelime.charAt(i);

				}
				System.out.println(eksik + "...");
				break;

			case 6:

				System.out.println("Kelime giriniz:");
				kelime = scanner.next();
				String noktali = kelime.substring(0, 3);
				for (int i = 3; i < kelime.length(); i++) {
					noktali += ".";

				}
				System.out.println(noktali);

			default:
				break;
			}
		}
	}
}
