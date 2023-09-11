package lesson14;

import java.time.LocalDateTime;

public class Mail {

	private String baslik;
	private String icerik;
	private LocalDateTime gonderiSaati;
	private String gonderen;

	public Mail() {
		super();
		this.gonderiSaati = LocalDateTime.now();
		this.gonderen = "admin@xbanka.com";
	}

	public Mail(String baslik, String icerik, LocalDateTime gonderiSaati) {
		super();
		this.baslik = baslik;
		this.icerik = icerik;
		this.gonderiSaati = gonderiSaati;

	}

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public LocalDateTime getGonderiSaati() {
		return gonderiSaati;
	}

	public void setGonderiSaati(LocalDateTime gonderiSaati) {
		this.gonderiSaati = gonderiSaati;
	}

	public String getGonderen() {
		return gonderen;
	}

	public void setGonderen(String gonderen) {
		this.gonderen = gonderen;
	}

}
