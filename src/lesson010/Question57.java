package lesson010;

import java.util.Scanner;

public class Question57 {

	public static void main(String[] args) {

		// login() methodu

		// e mail şifre al
		// e mail hotmail ve gmail uzantılı olacak, şifre girdiği 2 şifre aynıysa
		// email ve şifrenin doğru olması lazım
		// emailCheck ve parswordCheck metodlarını yaz
		register();

	}

	public static boolean emailCheck(String email) {
		boolean check;
		String format1 = "@hotmail.com";
		String format2 = "@gmail.com";

		if (email.contains(format1) || email.contains(format2)) {
			check = true;
			System.out.println("email doğru formatta");
		} else {
			check = false;
			System.out.println("email hatalı");
		}
		return check;
	}

	public static boolean passwordCheck(String password, String rePassword) {
		boolean sifreKontrol = false;
		if (!password.equals(rePassword)) {
			System.out.println("Şifrele uyuşmuyor.");
		} else {
			sifreKontrol = true;
		}
		return sifreKontrol;
	}

	// ödev =
	// menü diye bir metod yaz
	// registerda sadece her şey tamamsa true döndün yanlışsa false dönsün
	// kullanıcıdan veri almak için iki metod daha yazalım şifre ve mail için
	// register metodunda kullanıcıdan sürekli veri almayalım

	public static void register() {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		boolean check2 = true;
		while (check) {
			System.out.println("email giriniz");
			String email = scanner.nextLine();
			boolean mailKontrol = emailCheck(email);
			if (!mailKontrol) {
				continue;
			} else {
				while (check2) {
					System.out.println("Şifrenizi girin ");
					String sifre1 = scanner.nextLine();

					System.out.println("Şifrenizi Tekrar Girin: ");
					String sifre2 = scanner.nextLine();
					boolean sifreKontrol = passwordCheck(sifre1, sifre2);
					if (!sifreKontrol) {
						continue;
					} else {
						System.out.println("Kayıt Başarılı ");
						check = false;
						check2 = false;
					}
				}
			}
		}
	}

}
