package lesson004;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {

		// girilen sayı için çarpım tablosunu veren program
		// input 6
		// 6*1 =6
		// 6*2=12 .....

		Scanner sc = new Scanner(System.in);

		System.out.println("sayı giriniz");
		int sayi = sc.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(sayi + "*" + i + "=" + (i * sayi));

		}
		
		//bütün çarpım tablosu
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
				
			}
			
		}

	}

}
