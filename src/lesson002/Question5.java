package lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		
		// girilen tl değerini usd çeviren program
		
		Scanner scanner = new Scanner(System.in);
		
		double tl, usd ;
		
		System.out.println("dolar kurunu giriniz");
		double usdkarsilik = scanner.nextDouble();
		
		
		
		System.out.println("tl degerini giriniz");
		tl = scanner.nextDouble();
		
		usd = tl/usdkarsilik;
		
		System.out.println(tl + "TL " + usd + " dolardir ");

	}

}
