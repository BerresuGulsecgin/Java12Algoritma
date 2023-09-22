package lesson21;

import java.util.InputMismatchException;
import java.util.Scanner;

import lesson21.utils.ConstantErrorMessage;

public class TryCatchOrnek {

	public static void main(String[] args) {

		// bitane bölme metodu yazalım kulllancıdan 2 tane sayı alacağız
		// bölümü return et
		// programın hata alma

		System.out.println(bolme());

		System.out.println("devam");
	}

	public static double bolme() {

		try {
			Scanner sc = new Scanner(System.in);
			// sc.close();
			System.out.println("bölüm girinz");
			int sayi1 = sc.nextInt();
			System.out.println("bölen girinz");
			int sayi2 = sc.nextInt();

			double bolum = sayi1 / sayi2;

			return bolum;
		} catch (InputMismatchException e) {
			System.out.println("lütfen düzgün değer giriniz");

		} catch (ArithmeticException e) {
			System.err.println("0 a bölünemez error");
		} catch (IllegalStateException e) {
			System.err.println("scanner kapalı hatası");
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;

	}

	public static double carpma() {

		try {
			Scanner sc = new Scanner(System.in);
			// sc.close();
			System.out.println("bölüm girinz");
			int sayi1 = sc.nextInt();
			System.out.println("bölen girinz");
			int sayi2 = sc.nextInt();

			double carpim = sayi1 * sayi2;

			return carpim;
		} catch (InputMismatchException e) {
			System.out.println(ConstantErrorMessage.INPUT_ERROR_MESSAGE);

		} catch (ArithmeticException e) {
			System.err.println("0 a bölünemez error");
		} catch (IllegalStateException e) {
			System.err.println(ConstantErrorMessage.SCANNER_MİGHT_BE_CLOSED);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;

	}

}
