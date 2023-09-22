package lesson20.StreamUygulama;

public class Main {

	public static void main(String[] args) {
		// bitane EUrun enum ı olsun : ürününkendisi+fiyatı
		// Cips(50), Kola(25)

		// Market sınıfı açalım

		// Mainde program başlayınca ürünlerin hepsi oluşmuş olsun

		Market market = new Market();
		System.out.println("---------------------------");
		market.urunlerveFiyatlarListesiGoster();
		System.out.println("---------------------------");
		market.sepeteUrunEkle();
		market.sepeteUrunEkle();
		market.sepeteUrunEkle();
		market.sepeteUrunEkle();
		System.out.println("---------------------------");
		market.sepetiGoster();
		System.out.println("---------------------------");
		market.ortalamaAl();

	}

}
