package lesson003;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// verilen sayınını 5in kuvveti olup olmadığını bul

		Scanner sc = new Scanner(System.in);

		System.out.println("sayı griiniz");
		int sayi = sc.nextInt();

		Boolean kontrol = true;

		while (kontrol == true) {
			if (sayi % 5 == 0) {
				sayi = sayi / 5;
				if (sayi == 1) {
					System.out.println("kuvvetidir");
					kontrol = false;
				}
			} else {
				System.out.println("kuvveti değil");
				kontrol = false;

			}

		}

	}

}

/*String besinKati= "5 katı değil";


while (sayi!=1) {
	if (sayi%5!=0) {
		besinKati="5 katı değil";
	sayi=1;
	
	}
	else
		besinKati="beşin katıdır";
	sayi/=5;
				
}

System.out.println(besinKati);*/
