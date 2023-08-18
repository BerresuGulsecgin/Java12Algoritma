package lesson004;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {

		// hesap makinesi

		Scanner sc = new Scanner(System.in);

		String operator = "";
		System.out.println("işlem yapılacak sayı");
		double sayi = sc.nextInt();
		System.out.println("yapılacak işlem");
		operator = sc.next();

		double sonuc = sayi;

		while (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {

			System.out.println("işlem yapılacak sayı");
			double sayi2 = sc.nextInt();
			switch (operator) {
			case "+":
				sonuc = sonuc + sayi2;

				break;
			case "-":
				sonuc = sonuc - sayi2;

				break;
			case "*":
				sonuc = sonuc * sayi2;

				break;
			case "/":
				sonuc = sonuc / sayi2;

				break;

			default:
				operator = "";
				break;
			}
			System.out.println("yapılacak işlem");
			operator = sc.next();

		}

		System.out.println(sonuc);
		
		

	}

}
