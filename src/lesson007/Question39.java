package lesson007;

public class Question39 {

	public static void main(String[] args) {
		// dizide 2 mi fazla 4 mü bul

		int[] dizi = { 1, 4, 2, 2, 4, 4, 2, 2, 9, 2, 8 };
		int ikiler = 0;
		int dortler = 0;

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == 2) {
				ikiler++;

			} else if (dizi[i] == 4)
				dortler++;

		}
		if (ikiler > dortler) {
			System.out.println("ikiler fazla.dizide " + ikiler + " tane iki " + dortler + " tane dört var");

		} else if (ikiler < dortler)
			System.out.println("dörler fazla.dizide " + dortler + " tane dört " + ikiler + " tane iki var");
		else
			System.out.println("iki ve dört eşit " + dortler + " tane  var");
	}

}
