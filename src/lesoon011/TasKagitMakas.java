package lesoon011;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

	static String[] secenekler = { "TAS", "KAGIT", "MAKAS" };
	static Scanner sc = new Scanner(System.in);

	public static String pcSecim() {

		Random rnd = new Random();
		int index = rnd.nextInt(secenekler.length);
		return secenekler[index];

	}

	public static String kullaniciSecim() {

		for (int i = 0; i < secenekler.length; i++) {
			System.out.println((i + 1) + "-" + secenekler[i]);

		}

		int secim = secimKontrol();
		return secenekler[secim - 1];
	}

	public static int secimKontrol() {
		int secim = 0;
		while (secim < 1 || secim > 3) {
			System.out.println("Lütfen seçinizi yapınız --> ");
			secim = sc.nextInt();

		}
		return secim;
	}

//	public static void kazanan() {
//
//		if (pcSecim().equals(kullaniciSecim())) {
//			System.out.println("berabere");
//
//		} else if ((pcSecim().equals(secenekler[0]) && kullaniciSecim().equals(secenekler[2]))
//				|| (pcSecim().equals(secenekler[1]) && kullaniciSecim().equals(secenekler[2]))
//				|| (pcSecim().equals(secenekler[2]) && kullaniciSecim().equals(secenekler[0]))) {
//			System.out.println("kazandınız");
//		} else  {
//			System.out.println("kaybettiniz");
//		}
//
//	}

	public static void oyun() {
		String pcSecim = pcSecim();
		String secim = kullaniciSecim();

		System.out.println("pc seçim = " + pcSecim);
		System.out.println("benim seçim = " + secim);

		if (pcSecim.equals(secim)) {
			System.out.println("berabere");

		} else {
			switch (secim) {
			case "TAS":
				if (pcSecim.equals("KAGIT")) {
					System.out.println("kaybettiniz");
				} else {
					System.out.println("kazandınız");
				}

				break;
			case "KAGIT":
				if (pcSecim.equals("TAS")) {
					System.out.println("kazandınız");
				} else {
					System.out.println("kaybettiniz");
				}

				break;
			case "MAKAS":
				if (pcSecim.equals("TAS")) {
					System.out.println("kaybettiniz");
				} else {
					System.out.println("kazandınız");
				}

				break;

			default:
				break;
			}
		}
	}

}
