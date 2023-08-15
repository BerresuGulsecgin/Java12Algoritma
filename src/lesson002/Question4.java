package lesson002;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		//verilen iki sayıdan hangisinin büyük olduğunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi1, sayi2;
		
		System.out.println("birinci sayı giriniz");
		sayi1 = scanner.nextInt();
		
		System.out.println("ikinci sayı giriniz");
		sayi2 = scanner.nextInt();
		
		if (sayi1<sayi2) {
			
			System.out.println("büyük olan sayı" +sayi2);
			
		}
		else if (sayi1==sayi2) {
			
			System.out.println("sayılar eşit ve " + sayi1);			
		}	
		
		else {
			System.out.println("büyük olan sayı" +sayi1);
		}
		
		
		
		
		
		

	}

}
