package lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		// girilen sayınıın tek mi çiftmi olduğunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("sayıyı giriniz");
		int sayi = scanner.nextInt();
		
		if (sayi%2==0) {
			System.out.println("sayı çift");
			
		}
		
		else {
			System.out.println("sayı tek");
		}
		
		

	}

}
