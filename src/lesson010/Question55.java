package lesson010;

import java.util.Scanner;

public class Question55 {

	public static void main(String[] args) {
		// 1 den 100e kadar olan sayıların asallarını bulan metod

		// kulanıcının girdiği sayıya kadar aslları göster metodu yap

		asallariGoster();

	}

	public static void asallariGoster() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("hangi sayıya kadar");
		int sayi = scanner.nextInt();

		for (int i = 1; i < sayi; i++) {
			boolean asal = asalMi(i);
			if (asal) {
				System.out.println(i + " ");

			}

		}

	}

	public static boolean asalMi(int sayi)

	{
		boolean asal = true;
		if (sayi < 2) {
			asal = false;

		} else {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					asal = false;
					break;

				}

			}
		}

		return asal;

	}

}
