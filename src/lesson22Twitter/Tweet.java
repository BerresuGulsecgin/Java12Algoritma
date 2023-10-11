package lesson22Twitter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Tweet {

	private String id;
	private String icerik;

	private LocalDateTime olustmaTarihi;

	private int yorumSayisi;
	private int begeniSayisi;

	private Set<HashTag> hashTag = new HashSet<>();

	private List<User> begenenler = new ArrayList<>();

	private List<Comment> yorumlar = new ArrayList<>();

	public Tweet(String icerik) {
		this.id = UUID.randomUUID().toString();
		this.olustmaTarihi = LocalDateTime.now();
		this.icerik = icerik;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public LocalDateTime getOlustmaTarihi() {
		return olustmaTarihi;
	}

	public int getYorumSayisi() {
		return yorumSayisi;
	}

	public void setYorumSayisi(int yorumSayisi) {
		this.yorumSayisi = yorumSayisi;
	}

	public int getBegeniSayisi() {
		return begeniSayisi;
	}

	public void setBegeniSayisi(int begeniSayisi) {
		this.begeniSayisi = begeniSayisi;
	}

	public Set<HashTag> getHashTag() {
		return hashTag;
	}

	public List<User> getBegenenler() {
		return begenenler;
	}

	public List<Comment> getYorumlar() {
		return yorumlar;
	}

}
