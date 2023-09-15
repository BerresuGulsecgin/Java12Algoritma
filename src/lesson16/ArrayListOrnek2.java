package lesson16;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek2 {

	public static void main(String[] args) {

		ArrayList<Integer> tek = new ArrayList<Integer>();
		ArrayList<Integer> cift = new ArrayList<Integer>();

		Random rnd = new Random();
		int sayi;

		for (int i = 0; i < 35; i++) {
			sayi = rnd.nextInt(1, 101);
			if (sayi % 2 == 0) {
				cift.add(sayi);
			} else {
				tek.add(sayi);
			}
		}
		System.out.println(tek);
		System.out.println(cift);

	}

}
