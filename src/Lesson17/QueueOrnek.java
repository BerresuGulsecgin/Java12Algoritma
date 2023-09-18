package Lesson17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek {

	public static void main(String[] args) {
		// bir tane queue oluştur
		// 10-12 tane isim gönder
		// daha sonra 1-10 arasında bir sayı üret. bu sayı bizim pideSayisi olacak

		// kuyruktakiere dağıt
		// pideyi alan kişileri kuyruktan çıkart
		// alamayan kişileri yazıdr

		Queue<String> kisiler = new LinkedList<String>();
		kisiler.add("a");
		kisiler.add("b");
		kisiler.add("c");
		kisiler.add("d");
		kisiler.add("e");
		kisiler.add("f");
		kisiler.add("g");
		kisiler.add("h");
		kisiler.add("ı");
		kisiler.add("i");
		kisiler.add("j");
		kisiler.add("k");
		kisiler.add("l");
		
		

		Random rnd = new Random();
		int sayi = rnd.nextInt(1, 11);
		System.out.println(sayi);

		for (int i = 0; i < sayi; i++) {
			System.out.println(kisiler.poll()+" çek aldı");
		}

		System.out.println(kisiler);
		int size=kisiler.size();
		for (int i = 0; i < size; i++) {
			System.out.println(kisiler.poll()+" alamadı");
		}
		
	}

}
