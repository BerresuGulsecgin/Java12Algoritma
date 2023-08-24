package lesson009;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		// topla metodu yaz
		// 10 dan büyük mü diye bir metod yaz
		// topladan dönen değer 10dan büyükse true dön değilse false dön

		int toplamSonucu = topla();
		boolean check = ondanBuyukMu(toplamSonucu);
		System.out.println(check);

		hediye(check);
	}

	public static int topla() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. sayı");
		int sayi1 = sc.nextInt();
		System.out.println("2. sayı");
		int sayi2 = sc.nextInt();
		int sonuc = sayi1 + sayi2;
		return sonuc;

	}

	public static boolean ondanBuyukMu(int sum) {

		if (sum > 10) {
			return true;

		} else {
			return false;
		}

	}

	public static void hediye(boolean kontrol) {
		
		  //System.out.println(kontrol ? "hediye çeki kazandınız" :"hediye kazanamadınız" ); ternary ile tek satırda yazılabilir
		if (kontrol) {
			System.out.println("hediye çeki kazandınız");

		} else {
			System.out.println("hediye kazanamadınız");
		}

	}

}
