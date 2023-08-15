package lesson002;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		// girilen 3 sayının en büyüğünü yazdır

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. sayıyı giriniz");
		int sayi1 = scanner.nextInt();

		System.out.println("2. sayıyı giriniz");
		int sayi2 = scanner.nextInt();

		System.out.println("3. sayıyı giriniz");
		int sayi3 = scanner.nextInt();

		if (sayi1 >= sayi2 && sayi1 >= sayi3)
			System.out.println("en büyük sayı " + sayi1);

		else if (sayi2 >= sayi1 && sayi2 >= sayi3)
			System.out.println("en büyük sayı " + sayi2);

		else
			System.out.println("en büyük sayı " + sayi3);
		
		// enbuyuk=sayi1
		// if (sayi2>enbuyuk)
		//enbuyuk=sayi2
		//if (sayi3>enbuyuk)
		//enbuyuk=sayi3
		//sout(enbuyuk)

	}

}
