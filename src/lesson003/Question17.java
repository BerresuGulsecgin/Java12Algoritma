package lesson003;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		
		// girilen sayıya kadar yazdır yazdır
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("sayı bgirin");
		int sayi = sc.nextInt();
			
		int i = 0;
		
		
		while (i<=sayi) {
			System.out.println(i);
			i++;
			
		}
	}

}
