package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		
		// kullanıcıdan alınan vize ve final notmarını hesaplayarak geçip geçmediğini
		// vize %40
		//final %60
		// 50den büyük eşitse geçer
		
		
		Scanner scanner = new Scanner(System.in);
		
		double vize, fin, gecer;
		
		System.out.println("vizenizi girin");
		vize = scanner.nextDouble();
		
		System.out.println("finalinizi girin");
		fin = scanner.nextDouble();
		
		gecer = (vize*0.4)+(fin*0.6);
		
		if (vize>100 || fin>100 || vize<0 || fin<0) {			
			System.out.println("hatalı değer girdiniz");			
		        }
				
		else if (gecer>=50) {					
					System.out.println(gecer+ " notu ile geçtiniz");					
				}
				
		else {
					System.out.println(gecer+ " notu ile kaldınız");
					}
		
		
	}

}
