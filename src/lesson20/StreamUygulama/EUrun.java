package lesson20.StreamUygulama;

public enum EUrun {
	Cips(50), Kola(25), Gofret(15), Sut(20), Kek(12)

	;

	private final double fiyat;

	private EUrun(double fiyat) {
		this.fiyat = fiyat;
	}

	public double getFiyat() {
		return fiyat;
	}
	
	

}
