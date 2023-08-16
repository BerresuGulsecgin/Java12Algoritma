package lesson003;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// girilen sayınını basamklarını topla
		// 127 = 1+2+7

		Scanner sc = new Scanner(System.in);

		System.out.println("sayı giriniz");
		int sayi = sc.nextInt();

		int top = 0;

		while (sayi != 0) {

			top = (sayi % 10) + top;
			sayi /= 10;

		}
		System.out.println(top);
	}

}
