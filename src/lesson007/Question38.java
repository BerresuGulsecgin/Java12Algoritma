package lesson007;

public class Question38 {

	public static void main(String[] args) {
		// dizi elmanını tek çift olup olmadığı yazdır
		// dizi toplamını yazdır

		int[] sayilar = { 2, 4, -5, 85, 256, 16, 1258, 81, 14 };
		int top = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " sayısı çifttir");

			} else {
				System.out.println(sayilar[i] + " sayısı tektir");
			}
			top = top + sayilar[i];
		}
		System.out.println("dizi toplamı = " + top);

	}

}
