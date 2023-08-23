package lesson008;

public class Question47 {

	public static void main(String[] args) {

		// bir dizide art arda gelen iki indexin sayı değeri 2 ise true false yazdıralım

		int[] sayilar = { 2, 5, 9, 2, 2, 1258, 2, 32, 2, 2 };
		boolean iki = false;
		int sayac = 0;

		for (int i = 0; i < sayilar.length - 1; i++) {
			if (sayilar[i] == 2 && sayilar[i + 1] == 2) {
				iki = true;
				sayac++;

			}

		}
		System.out.println(iki);
		System.out.println("toplma " + sayac + " tane art arda iki vardır");

	}

}
