package lesson27;

import java.util.Random;

public class Taksi extends Thread {
	private int id;
	private long hiz;
	Random rnd = new Random();

	public Taksi(int id) {
		this.id = id++;
		this.hiz = rnd.nextInt(1, 5);

	}

	@Override
	public void run() {
		while (!TaksiMain.musteriKuyrugu.isEmpty()) {
			int musteri = TaksiMain.musteriKuyrugu.poll();
			System.out.println("Taksi " + this.id + ", Müşteri " + musteri + " ile yola çıktı ");
			try {
				Thread.sleep(this.hiz * 1000); // Taksi hızına göre bekleme süresini ayarla (saniye cinsinden)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	

}
// * Durağımızda toplam 10 adet taksi olsun ve durak onunde 100 kişilik
// * bir müşteri kuygrugu(queue) olsun bu musterilerimiz için sınıf yaratmayalım
// * bir int bir id değeri olarak tutalım
// *
// * 10 adet taksimiz hızlarına göre kuyruktan sırayla musteri alacaklardır

// Takside run methodunu override edelim
// taksilere müşteri alcaz
// müşterileri duraktaki kuyruktan alcaz
// ve aldığımız müşterileri listeye atıcaz
// taksini her müşteri aldığında hangi taksinin kaçıncı müşterisini aldığını
// yazdıralım
