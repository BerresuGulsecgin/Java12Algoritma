package lesson19;

import java.util.ArrayList;
import java.util.List;

public class StreamOrnek {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Integer> sayilar = new ArrayList<Integer>();
		sayilar.add(5);
		sayilar.add(55);
		sayilar.add(60);
		sayilar.add(12);
		sayilar.add(97);
		sayilar.add(77);

		System.out.println("5 ile bölünen sayıları listeye atalım ve yazdıralım");

		List<Integer> bolunenSayi = sayilar.stream().filter(s -> s % 5 == 0).toList();

		System.out.println(bolunenSayi);

		System.out.println("sayıları kendisiyle çarpıp yeni bir listeye atalım");

		List<Integer> sarpilanSsayi = sayilar.stream().map(s -> s * s).toList();
		System.out.println(sarpilanSsayi);

		System.out.println("kaç tane 5e bölünen sayı var onu bulalım");

		long beseBolunen = sayilar.stream().filter(s -> s % 5 == 0).count();
		System.out.println("adet " + beseBolunen);

	}

}
