package lesson005;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		
		// girilen kelimenin harflerini yazdır
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("kelimeyi girin");
		String kelime = sc.next();
		
		for (int i = 0; i <= kelime.length()-1; i++) {
			System.out.println(kelime.charAt(i));
			
		}

	}

}
