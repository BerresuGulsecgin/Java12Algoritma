package lesson003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		
		// girilen iki sayının toplamı çift ise true tek ise false yazdır
		//boolean olarak yap
		
		Scanner sc = new Scanner(System.in);
		
		boolean ciftMi;
		int top;
				
		System.out.println("1.sayıyı giriniz");
		int sayi1=sc.nextInt();
		
		System.out.println("2.sayıyı giriniz");
		int sayi2=sc.nextInt();
		
		top = sayi1+sayi2;
		
		if (top%2==0) {
			ciftMi= true;
			
		}
		else {
			ciftMi= false;
		}
		
		System.out.println(ciftMi);
		
		
		
		

	}

}
