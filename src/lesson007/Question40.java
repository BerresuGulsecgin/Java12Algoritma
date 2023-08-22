package lesson007;

import java.util.Arrays;

public class Question40 {

	public static void main(String[] args) {
		// negatifleri farklı arraye at yeni array yazdır

		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		int sayac = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				sayac++;

			}

		}

		int[] negatif = new int[sayac];

		int index = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				negatif[index] = sayilar[i];
				index++;

			}

		}
		System.out.println(Arrays.toString(negatif));

	}

}
