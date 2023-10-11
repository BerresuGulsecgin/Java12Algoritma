package lesson22Twitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Profile {

	private String id;
	private int tweetSayisi;
	private int takipciSayisi;
	private int takipSayisi;
	private String photo;
	private Address address;

	private List<User> takipcileri = new ArrayList<>();
	private List<User> takipEttikleri = new ArrayList<>();
	private List<Tweet> atilanTweetler = new ArrayList<>();
	private List<User> engellenenler = new ArrayList<>();

	private Map<String, List<String>> mesajlar = new HashMap<>();

	public Profile() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public int getTweetSayisi() {
		return tweetSayisi;
	}

	public void setTweetSayisi(int tweetSayisi) {
		this.tweetSayisi = tweetSayisi;
	}

	public int getTakipciSayisi() {
		return takipciSayisi;
	}

	public void setTakipciSayisi(int takipciSayisi) {
		this.takipciSayisi = takipciSayisi;
	}

	public int getTakipSayisi() {
		return takipSayisi;
	}

	public void setTakipSayisi(int takipSayisi) {
		this.takipSayisi = takipSayisi;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<User> getTakipcileri() {
		return takipcileri;
	}

	public List<User> getTakipEttikleri() {
		return takipEttikleri;
	}

	public List<Tweet> getAtilanTweetler() {
		return atilanTweetler;
	}

	public List<User> getEngellenenler() {
		return engellenenler;
	}

	public Map<String, List<String>> getMesajlar() {
		return mesajlar;
	}

}
