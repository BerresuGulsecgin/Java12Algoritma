package lesson24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * ödev sınav soruları
 * soru sınıfı oluştur
 * soru no:
 * soru içerik
 * soru şıkları Array al
 * cepap
 * puan
 * 
 * Ogrenci nesnemiz olsun
 * Register işlemi yapacak sonra ogrenciler adında bir dosyaya kaydedilecek
 * isim,şifre,okulno
 * 
 * serilize işlemi ile dosyaya kayıt et
 * 
 * Login olunca sınavı başlatabilsin(zaman opsiyonel)
 * sınavı çözdükten sonra
 * öğrencinin sınav notu ile beraber notlar adlı dosyaya atalım isim ve okulno ile
 * 
 */

public class FileExample {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// switch case olacak
		// 1 dosya yarat eğer dosya oluşmuşsa hata fırlat FileAlreadyExistsException

		menu();

	}

	public static void menu() {

		System.out.println("1- dosya oluştur");
		System.out.println("2- Dosyaya metin ekle");
		System.out.println("3- Dosyayı oku");
		System.out.println("Seçim giriniz");

		int secim = sc.nextInt();
		sc.nextLine();
		switch (secim) {
//		case 1:			
//			dosyaOlustur(ConstantFile.file);
//			
//			break;
		case 1:

			File file = dosyaAdiniBelirle();
			dosyaOlustur(file);

			break;
		case 2:

			metinEkle();

			break;
		case 3:

			dosyaOku();

			break;

		default:
			break;
		}

	}

	public static void dosyaOlustur(File file) {

		// File file = new File("deneme.txt");

		try {
			if (file.createNewFile()) {
				System.out.println("dosya oluştu " + file.getName());
			} else {
				throw new IOException("File Already Exists");
			}
		} catch (Exception e) {
			System.out.println("Hata-->" + e.getMessage());
		}
	}

	public static File dosyaAdiniBelirle() {
		// kullanıcı sadece dosya ismini girsin sonuna .txt yazmasın
		// input -> deneme output -> deneme.txt

		System.out.println("dosya adınızı giriniz");
		String dosyaAdi = sc.nextLine();
		String dosyaYolu = dosyaAdi + ".txt";
		File file = new File(dosyaYolu);
		return file;

	}

	public static void metinEkle() {

//		File file = selectFile();

		File file = dosyaAdiniBelirle();
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
			System.out.println("Metin giriniz");
			String text = sc.nextLine();
			writer.write(text + "\n");
		} catch (Exception e) {

		}

	}

	private static File selectFile() {
		Path path = Path.of(System.getProperty("user.dir"));

		try {
			List<Path> paths = Files.list(path).collect(Collectors.toList());
			paths.forEach(p -> System.out.println(p.getFileName()));
			System.out.println("Hangi dosyaya yazmak istersiniz");
			int secim = sc.nextInt();
			sc.nextLine();
			return new File(paths.get(secim).toUri());
		} catch (Exception e) {

		}
		return null;

	}

	public static void dosyaOku() {
		File file = dosyaAdiniBelirle();

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String okunanSatir;
			while ((okunanSatir = reader.readLine()) != null) {
				if (okunanSatir.equals("")) {
					System.out.println(okunanSatir);
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("dosya bulma hatası");
		} catch (IOException e) {
			System.out.println("hatalı");

		}
	}

}
