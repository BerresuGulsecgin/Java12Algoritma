package lesson003;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		
		// girilen sayıya kadar tek olan sayıların toplamı
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("sayı griiniz");
		int sayi = sc.nextInt();
		
		int i =1;
		int top=0;
		
		while (i<=sayi) {
			if(i%2!=0)
				top=top+i;
			i++;
			
		}
		System.out.println(top);

	}

}
