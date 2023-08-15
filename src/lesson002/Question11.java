package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		
		// bir dairenin çevresini ve alanını hesapla
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("yarı capi giriniz");
		double r = scanner.nextInt();
		
		if (r>=0) {
		System.out.println("çevresi = "  + 2*3.14*r);
		System.out.println("alanı = " + 3.14*r*r);
		}
		else
			System.out.println("yarıçap negatif olamaz );  // "\n" ile alt satıra geçirir
		
		
		
	}

}
