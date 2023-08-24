package lesson009;

import java.util.Scanner;

public class Question52 {

	public static void main(String[] args) {

		// parametre olarak girilen isim ve soyisim değerini alıp
		// ekrana yazdıralım

		// isminiz ---> soy isminiz ---->
		// kullanıcının ismini farklı metod
		// soyadını farklı metod
		// yazdırma farklı metod

		String isim = isimYaz();
		String soyisim = soyisimYaz();

		ekranaYaz(isim, soyisim);

		// System.out.println(ekranaYaz(isim, soyisim));

		String sonuc = ekranaYaz(isim, soyisim);
		System.out.println(sonuc); // void yerine string koyarsan metodda ekrana kendin yazıdr

		// ekranaYaz(isimYaz(), soyisimYaz()); bu şekilde de yazılabilir
	}

	public static String isimYaz() { // buradaki değişkenlerin yukarıdakilerle aynı olmasına gerek yok
		Scanner sc = new Scanner(System.in);
		System.out.println("isminizi giriniz");
		String isim = sc.next();
		return isim;

	}

	public static String soyisimYaz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("soyisminizi giriniz");
		String soyisim = sc.next();
		return soyisim;
	}

	public static String ekranaYaz(String name, String surname) {
		// System.out.println("isminiz ----->" + name + " soyisminiz-------->" + //void
		// ise böly4 yaz
		// surname);
		return "isminiz ----->" + name + " soyisminiz-------->" + surname;
	}

}
