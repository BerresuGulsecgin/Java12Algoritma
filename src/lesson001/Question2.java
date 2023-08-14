package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		//kullanıcıdan aldığımız 2 değeri çarpıp sonucu yazdır
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi1;
		int sayi2;
		int carpim;
		
		System.out.println("1. sayıyı giriniz");
		sayi1 = scanner.nextInt();
		
		System.out.println("2. sayıyı giriniz");
		sayi2 = scanner.nextInt();
		
		carpim = sayi1*sayi2;
		
		System.out.println(carpim);
		
		//System.out.println(sayi1*sayi2); bölye de olur
		
		
		
		
		
	

	}

}
