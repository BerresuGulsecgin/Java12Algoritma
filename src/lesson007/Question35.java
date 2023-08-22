package lesson007;

import java.util.Random;
import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		// sayı tahmini uygulaması
		// sürekli kullanıcıdan sayı tahmin etmesini iste
		// tahmin ettiği sayı az ise arttı çok ise azalt yazdır
		// doğru ise kaçıncı denemesinde bulduğunu söyle

		// 5 tahmin hakkı olsun

		Random rnd = new Random();

		Scanner sc = new Scanner(System.in);

		int sayi = rnd.nextInt(1, 5);
		System.out.println(sayi);

		int hak = 0;

		System.out.println("tahmin giriniz");
		int tahmin = sc.nextInt();

		while (sayi != tahmin) {
			if (hak != 5) {
				if (sayi < tahmin) {
					System.out.println("azalt");

				} else if (sayi > tahmin) {
					System.out.println("arttır");

				} else if (sayi==tahmin){
					System.out.println("bildiniz");
					break;
				}

				System.out.println("tahmin giriniz");
				tahmin = sc.nextInt();
				hak++;
			} else {
				System.out.println("bilemediniz");
				break;
			}

		}
	

	}

}
