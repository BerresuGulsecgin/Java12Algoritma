package lesson23;

import java.util.*;
import java.util.Scanner;

public class TryCatchOrnek {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] array = { "6", "10", "bc", null, "20" };

		// parametre olarak array alan ve girdiğimiz değere karşılık gelen indexi
		// yazdıran program
		// input -->2
		// output-->bc
		// indexBul(array);

		// indexYazdir(array);
		try {
			toplam2(array);
		} catch (NullPointerCheck e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		indexYazdir(array);

	}

//	public static void indexBul(String[] array) {
//
//		System.out.println("hangi index olsun");
//		int index = sc.nextInt();
//
//		if (index < array.length) {
//			System.out.println(array[index]);
//		} else {
//			System.out.println("hatalı index");
//		}
//	}

	public static void indexYazdir(String[] array) {

		try {

			System.out.println("index gir");
			int index = sc.nextInt();
			System.out.println(array[index]);
		} catch (InputMismatchException e) {
			System.out.println("hatalı değer");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of index");

		} catch (IllegalStateException e) {
			System.out.println("Scanner kapalı");
		} catch (Exception e) {
			System.out.println("hata var");
		}

	}

	public static void toplam(String[] array) {
		int toplam = 0;
		int hataToplam = 0;

		for (int i = 0; i < array.length; i++) {
			try {
				toplam = toplam + Integer.parseInt(array[i]);
			} catch (Exception e) {
				System.out.println(e);
				hataToplam++;
			}

		}

		System.out.println(toplam);
		System.out.println(hataToplam);
	}

	// null alan varsa NullPointer fırlat
	public static void toplam2(String[] array) throws NullPointerCheck {
		int toplam = 0;
		int hataToplam = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				throw new NullPointerCheck("null hatası ....***");
			}
			try {
				toplam = toplam + Integer.parseInt(array[i]);
			}

			catch (Exception e) {
				System.out.println(e);
				hataToplam++;
			}

		}

		System.out.println(toplam);
		System.out.println(hataToplam);
	}

	// custom NullPointerCheck, exception sınıfı yazalım

}
