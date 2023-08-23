package lesson008;

public class Question50 {

	public static void main(String[] args) {

		// dizide 13 var ise hem 13ü hem de bir sonraki elemanı toplama dahil etme
		// toplam = 1+6 çıkmalı

		int sayilar[] = { 1, 13, 13, 13, 2, 5, 13, 1 };

		int top = 0;
		for (int i = 1; i < sayilar.length; i++) {

			if (sayilar[i] == 13) {
				continue;

			} else if (sayilar[i] != 13 && sayilar[i - 1] != 13) {
				top = top + sayilar[i];

			}

		}
		if (sayilar[0] != 13) {
			top = top + sayilar[0];

		}

		System.out.println(top);

		System.out.println("**********************************");

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] == 13 || (i > 0 && sayilar[i - 1] == 13)) {
				continue;

			} else {
				toplam = toplam + sayilar[i];

			}

		}

		System.out.println(toplam);
	}

}
