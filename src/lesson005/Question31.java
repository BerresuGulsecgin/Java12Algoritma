package lesson005;

import java.util.Iterator;
import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// Java,Spring,Postgre,React
		// yukarıdakini virgül hariç alt alta yazdır

		// bunun boşluklu çıktısını düzelt Java , Spring, Postgre , React gibi

		String text = "Java  ,  Spring , Postgre ,  React";

		System.out.println(text.substring(0, 4));
		System.out.println(text.substring(5, 11));
		System.out.println(text.substring(12, 19));
		System.out.println(text.substring(20, 25));

		System.out.println("********************");

		for (int i = 0; i < text.split(",").length; i++) {
			System.out.println(text.split(",")[i]); // split

		}

		System.out.println("********************");

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				System.out.println();

			} else
				System.out.print(text.charAt(i));

		}
		System.out.println();

		System.out.println("********************");

		int index = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				System.out.println(text.substring(index, i));
				index = i + 1;

			}

		}
		System.out.println(text.substring(index));

		System.out.println("******************");

		String kelime = "";

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				continue;

			}

			else if (text.charAt(i) == ',') {
				System.out.println();
				continue;

			} else {
				kelime = kelime + text.charAt(i);
			}

			System.out.print(text.charAt(i));

		}
	}

}
