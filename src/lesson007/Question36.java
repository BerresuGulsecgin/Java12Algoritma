package lesson007;

import java.util.Arrays;

public class Question36 {

	public static void main(String[] args) {
		// içinde 5 tane ülke bulunan bir dizi oluştur [amerika ukranya]
		// a ile biten ülkelerin yerine ? koy
		// ? koyulanlar için . index değişti diye bilgi paylaş

		String dizi[] = new String[] { "amerika", "ukranya", "türkiye", "kazakistan", "almanya" };

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].endsWith("a")) {
				dizi[i] = "?";
				System.out.println(i + ". index değişti");

			}

		}
		System.out.println(Arrays.toString(dizi));

	}

}
