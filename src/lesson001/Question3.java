package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		
		/* verilen ürününü satış fiyatı içinde %18 kdv ve %15 kar olduğu biliniyor.
		 * ham fiyatını bulunuz	 */
		
		Scanner scanner = new Scanner(System.in);
		
		double hamFiyat;
		int toplamFiyat;
		
		System.out.println("ürününü toplam fiyatı nedir ?");
		toplamFiyat = scanner.nextInt();
		
		hamFiyat = toplamFiyat / (1.18*1.15);
		
		System.out.println("ürünün hamfiyatı" + hamFiyat);

	}

}
