package lesson004;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {

		// hesap makinesi

		Scanner sc = new Scanner(System.in);

		System.out.println("1. sayı giriniz");
		int sayi3 = sc.nextInt();

		System.out.println("2. sayı giriniz");
		int sayi4 = sc.nextInt();

		String islem2 = "";

		System.out.println("yapılacak işlem nedir");
		islem2 = sc.next();

		int sonuc2 = 0;

		switch (islem2) {
		case "+":
			sonuc2 = sayi3 + sayi4;

			break;

		case "-":
			sonuc2 = sayi3 - sayi4;

			break;

		case "*":
			sonuc2 = sayi3 * sayi4;

			break;

		case "/":
			sonuc2 = sayi3 / sayi4;

			break;

		default:
			break;
		}

		System.out.println(sonuc2);
		
		

	}

}
