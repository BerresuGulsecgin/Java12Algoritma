package lesson005;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// girilen kelimenin içinde kaç tane e olduğunu bulan

		Scanner sc = new Scanner(System.in);

		System.out.println("kelimeyi girin");
		String text = sc.next();
		int sayac = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == 'e')
				sayac++;

		}
		System.out.println(sayac);

		System.out.println("******************************");

		// girilen kelimenin içinde aranacak harf

		System.out.println("kelimeyi girin");
		String kelime = sc.next().toLowerCase(); // toLowerCase hepsini küçük saklar
		int sayac1 = 0;

		System.out.println("hangi harf");
		String harf = sc.next().toLowerCase();

		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == harf.charAt(0))
				sayac1++;

		}
		System.out.println(sayac);

	}

}
