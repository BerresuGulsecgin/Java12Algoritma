package lesson004;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// girilen sayının mükemmel olup olmadığı bul
		// 6 1+2+3=6

		Scanner sc = new Scanner(System.in);

		System.out.println("sayı giriniz");
		int sayi = sc.nextInt();
		int top = 0;

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				top = top + i;

			}

		}
		if (top == sayi) {
			System.out.println("mük");

		} else

			System.out.println("mük değil");
	}

}
