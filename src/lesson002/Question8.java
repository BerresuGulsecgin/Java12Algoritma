package lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		// kenarları girilen üçgenin nasıl bir üçgen olduğunu söyleyen program

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. kenarı girirn");
		int kenar1 = scanner.nextInt();

		System.out.println("2. kenarı girirn");
		int kenar2 = scanner.nextInt();

		System.out.println("3. kenarı girirn");
		int kenar3 = scanner.nextInt();

		/*
		 * if (kenar1==kenar2 && kenar2==kenar3) 
		 * System.out.println("eşkenar");
		 * 
		 * else if (kenar1==kenar2 && kenar1!=kenar3) 
		 * System.out.println("ikizkenar");
		 * 
		 * else if (kenar2==kenar3 && kenar1!=kenar3) 
		 * System.out.println("ikizkenar");
		 * 
		 * else if (kenar1==kenar3 && kenar1!=kenar2) 
		 * System.out.println("ikizkenar");
		 * 
		 * else 
		 * System.out.println("çeşitkenar");
		 */

		if (kenar1 >0  && kenar2 > 0 && kenar3 > 0) {
			
		if (kenar1 == kenar2 && kenar2 == kenar3)
			System.out.println("eşkenar");
		else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3)
			System.out.println("ikizkenar");
		else
			System.out.println("cesitkenar");
		}
		else
			System.out.println("uzunluk - olamaz");
		
		
	}

}
