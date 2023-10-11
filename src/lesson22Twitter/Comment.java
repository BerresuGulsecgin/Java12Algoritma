package lesson22Twitter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Comment {
	
	private String yapanKisi;
	private String icerik;
	private LocalDateTime yapilmaTarihi;
	private int begeniSayisi;
	private List<User> begenenler = new ArrayList<>();
	
	public Comment(String yapanKisi, String icerik) {
		this.yapanKisi = yapanKisi;
		this.icerik = icerik;
		this.yapilmaTarihi = LocalDateTime.now();
	}

	public String getYapanKisi() {
		return yapanKisi;
	}

	public void setYapanKisi(String yapanKisi) {
		this.yapanKisi = yapanKisi;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public LocalDateTime getYapilmaTarihi() {
		return yapilmaTarihi;
	}

	public void setYapilmaTarihi(LocalDateTime yapilmaTarihi) {
		this.yapilmaTarihi = yapilmaTarihi;
	}

	public int getBegeniSayisi() {
		return begeniSayisi;
	}

	public void setBegeniSayisi(int begeniSayisi) {
		this.begeniSayisi = begeniSayisi;
	}

	public List<User> getBegenenler() {
		return begenenler;
	}

	
	
	
	
}
