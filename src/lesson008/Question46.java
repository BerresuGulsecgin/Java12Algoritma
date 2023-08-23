package lesson008;

import java.util.Arrays;

public class Question46 {

	public static void main(String[] args) {

		// içindeki tek sayıları bi taneArraye at ve Aray yazdır

		int[][] matris = { { 56, 23, 678, 231, 5, 3, 5 }, { 234, 21, 78, 26, 6, 4, 7 }, { 654, 33, 32, 67, 2, 5, 9 },
				{ 189, 35, 56, 89, 8, 6, 2 }, { 189, 35, 56, 89, 8, 6, 12 }, { 189, 33, 59, 89, 1, 7, 7 } };

		int sayac = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					sayac++;

				}

			}
		}

		int tek[] = new int[sayac];
		int index = 0;

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					tek[index] = matris[i][j];
					index++;

				}

			}

		}

		System.out.println(Arrays.toString(tek));

	}
}
