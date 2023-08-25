package lesson010;

import java.util.Scanner;

public class Question58 {

	public static void main(String[] args) {

		// girilen kelimenin ilk ve son harfini değiştirelim
		// girilen kelime 0-100 arası olmalı
		// tek harfli girilirse tek harfi return et
		// bilgeadam = milgeadab olacak

		System.out.println(change("bilgeadam"));

	}

	public static String change(String kelime) {
		if (kelime.length() < 2) {
			return kelime;

		}
		if (kelime.length() > 100 || kelime.length() < 0) {
			System.out.println("hata");

		}
		StringBuilder builder = new StringBuilder(kelime);
		char ilkHarf = kelime.charAt(0);
		char sonHarf = kelime.charAt(kelime.length() - 1);

		builder.setCharAt(0, sonHarf);
		builder.setCharAt(kelime.length() - 1, ilkHarf);
		return builder.toString();

	}

}
