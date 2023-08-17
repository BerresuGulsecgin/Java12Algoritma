package lesson004;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {

		// girilen sayının asal olup olmadığını bulalım

		Scanner sc = new Scanner(System.in);

		System.out.println("sayı giriniz");
		int sayi = sc.nextInt();

		boolean asal = true;

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asal = false;
				break;
			}
		}
		if (asal) {
			System.out.println("asal");

		} else
			System.out.println("asal değil");

	}

}
