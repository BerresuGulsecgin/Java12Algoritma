package lesson003;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {

		// girilen sayı hangi basamakta ve hangi sayı
		// 372 birler basamak 2, onlar basamak7 gibi

		Scanner sc = new Scanner(System.in);
		
		int basamakSayisi=1;
		int basamak;

		System.out.println("sayı griiniz");
		int sayi = sc.nextInt();

		while (sayi != 0) {
			basamak = sayi%10;
			sayi=sayi/10;
			System.out.println(basamakSayisi + " ler basmaağı " + basamak);
			basamakSayisi=basamakSayisi*10;

		}

	}

}
