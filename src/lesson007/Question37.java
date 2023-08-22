package lesson007;

import java.util.Arrays;

public class Question37 {

	public static void main(String[] args) {
		// 0dan küçük sayıları 100 ile değiştir

		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				sayilar[i] = 100;

			}

		}
		System.out.println(Arrays.toString(sayilar));
	

	}

}
