package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

		// girilen ortlamamanın harf notu
		// 90 üstü A
		// 80-90 bb
		// 70-80 c
		// 60-70 dd
		// 60 dan küçük ff

		Scanner scanner = new Scanner(System.in);

		System.out.println("ortalamanızı girin");
		int ort = scanner.nextInt();

		if (ort >= 0 && ort<101) {

			if (ort > 90)
				System.out.println("AA");
			else if (ort >= 80)
				System.out.println("BB");
			else if (ort >= 70)
				System.out.println("CC");
			else if (ort >= 60)
				System.out.println("DD");
			else
				System.out.println("FF");
		} else
			System.out.println("ortalama negatif ve 100 den buyuk olamaz");

	}

}
