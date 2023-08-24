package lesson009;

import java.util.Scanner;

public class Question51 {

	public static void main(String[] args) {

		// kullanıcıdan kelime al
		// buradaki ingilizce kelimeleri türkçe karakter ile değiştir

		// metod olarak yaz

		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

		Scanner sc = new Scanner(System.in);

		System.out.println("kelimenizi giriniz");
		String kelime = sc.next();

		System.out.println(changeTrtoEng(kelime, turkceKarakter, ingilizceKarakter));

	}

	public static String changeTrtoEng(String kelime, String[] array1, String[] array2) {

		for (int i = 0; i < array1.length; i++) {
			if (kelime.contains(array1[i])) {
				kelime = kelime.replace(array1[i], array2[i]);

			}

		}
		return kelime;

	}

}
