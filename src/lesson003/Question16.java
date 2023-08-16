package lesson003;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// kullanıcıdan 1-7 arası sayı alalım
		//günün hafta içi mi dışı mı olduğunu söylesin
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("gün giriniz");
		int gun = sc.nextInt();
		
		switch (gun) { // ok varsa break yok
		case 1,2,3,4,5 -> System.out.println(gun+ " haftaiçi");
		case 6,7 -> System.out.println(gun+ " haftasonu");
		
		
		default ->
		System.out.println("hatalı değer");
		}
		
		
		

	}

}
