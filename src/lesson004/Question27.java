package lesson004;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {

		// klavyeden girilen 0 ile 100 arasından 5 adet sayıdan en büyük
		// en küçük olanı bul

		Scanner sc = new Scanner(System.in);
		int min = 100;
		int max = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". sayıyı giriniz");
			int sayi = sc.nextInt();

			if (sayi < 0 || sayi > 100) {
				System.err.println("hatalı sayı girdiniz.");
				i--;
			} else {

				if (sayi < min)
					min = sayi;
				if (sayi > max)
					max = sayi;
			}

		}
		System.out.println("min" + min + " max" + max);

		System.out.println("************************");

		int j = 1;
		int min2 = 100;
		int max2 = 0;

		while (j <= 5) {
			System.out.println(j + ". sayıyı giriniz");
			int sayi2 = sc.nextInt();

			if (sayi2 > max2) {
				max2 = sayi2;

			}
			if (sayi2 < min2) {
				min2 = sayi2;

			}
			j++;
		}
		System.out.println("min " + max2 + "max " + min2);

	}

}
