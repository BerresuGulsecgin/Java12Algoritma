package lesson008;

import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) {

		// 2 ye 2 lik matris oluştur
		// kullanıcıdan isim değerleri al

		/// 1.grup
		// ahmet
		// mehmet

		// 2.grup
		// ali
		// ayse

		Scanner sc = new Scanner(System.in);

		String[][] matris = new String[2][2];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				System.out.println("isim giriniz");
				matris[i][j] = sc.next();

			}

		}
		for (int i = 0; i < matris.length; i++) {
			System.out.println((i + 1) + ". grup");
			for (int j = 0; j < matris.length; j++) {
				System.out.println(matris[i][j] + " ");

			}

		}
	}

}
