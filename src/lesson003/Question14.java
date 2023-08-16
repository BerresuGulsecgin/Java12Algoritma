package lesson003;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// girilen 3 sayıyı büyükten küçüğe sıralayan

		Scanner sc = new Scanner(System.in);

		int max = 0;
		int min = 0;
		int ort = 0;

		System.out.println("1.sayıyı giriniz");
		int sayi1 = sc.nextInt();

		System.out.println("2.sayıyı giriniz");
		int sayi2 = sc.nextInt();

		System.out.println("3.sayıyı giriniz");
		int sayi3 = sc.nextInt();

		if (sayi1 > sayi2 && sayi1 > sayi3) {
			max = sayi1;
		} else if (sayi2 > sayi3 && sayi2 > sayi1)
			max = sayi2;
		else
			max = sayi3;

		if (sayi1 < sayi2 && sayi1 < sayi3) {
			min = sayi1;
		} else if (sayi2 < sayi3 && sayi2 < sayi1)
			min = sayi2;
		else
			min = sayi3;

		if (sayi1 < max && sayi1 > min)
			ort = sayi1;

		else if (sayi2 < max && sayi2 > min)
			ort = sayi2;
		else
			ort = sayi3;

		System.out.println(max + " > " + ort + " > " + min);

	}

}
