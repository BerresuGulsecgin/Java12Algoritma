package lesson23;

public class NullPointerCheck extends Exception {

	private String mesaj;

	public NullPointerCheck(String mesaj) {
		super(mesaj);
		this.mesaj = mesaj;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

}
