package lesson003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {

		// telefona ve maile bir kod gelicek
		// kullanıcıdan kodları isticez
		// kodlar uyuşuyorsa sisteme kayıt oldunuz yazdır
		// hatalı durumları belirt

		Scanner sc = new Scanner(System.in);

		int tkod = 123;
		int mkod = 456;

		System.out.println("telefona gelen kodu giriniz");
		int tgkod = sc.nextInt();

		System.out.println("maile gelen kodu giriniz");
		int mgkod = sc.nextInt();

		if (tkod == tgkod && mkod == mgkod) {
			System.out.println("kayıt başarılı");

		} else if (tkod == tgkod && mkod != mgkod) {
			System.err.println("mail kodu hatalı"); // err kodu alta yazıyı kırmızı verir

		} else if (tkod != tgkod && mkod == mgkod) {
			System.err.println("tel kodu hatalı");

		} else
			System.err.println("iki kod hatalı");
		{
		}
	}

}
