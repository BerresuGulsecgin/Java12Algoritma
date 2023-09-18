package Lesson17;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnek2 {

	public static void main(String[] args) {
		// bitane müşteeri sınıfı açalım
		// kuyruğa müşterileri atalım
		// müşterilerin isim ve yaş değeri olsun
		// yaşı büyük olanlar ilk sırada yer alsın

		// Queue<Musteri> musteriler = new
		// PriorityQueue<>(Comparator.comparing(Musteri::getYas).reversed());

		Queue<Musteri> musteriler = new PriorityQueue<>();

		musteriler.add(new Musteri("ali", 60));
		musteriler.add(new Musteri("berre", 20));
		musteriler.add(new Musteri("veli", 40));
		musteriler.add(new Musteri("veli", 70));
		musteriler.add(new Musteri("veli", 80));
		musteriler.add(new Musteri("veli", 90));

		while (musteriler.iterator().hasNext()) {
			System.out.println(musteriler.poll());
		}

	}

}
