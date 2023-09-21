package lesson20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {
	/*
	 * User sınıfı olsun. ıd ve name toString ve bilgileri göster metodları olsun
	 * mainde users listesi oluşturulaım bir kaç uzer atalım bütün uzerler için
	 * bilgileri göster metodunu çağıralım stream ile
	 */

	public static void main(String[] args) {

		List<User> users = new ArrayList<User>();
		users.add(new User(1, "a", 15000, EGender.ERKEK));
		users.add(new User(2, "b", 12000, EGender.ERKEK));
		users.add(new User(3, "c", 18000, EGender.KADIN));
		users.add(new User(4, "d", 10000, EGender.KADIN));
		users.add(new User(5, "e", 17000, EGender.ERKEK));
		users.add(new User(6, "a", 16000, EGender.KADIN));

		users.stream().forEach(p -> p.bilgileriGoster());
		// users.stream().forEach(User::bilgileriGoster);
		// users.stream().forEach(((Consumer<User>)User::getId).andThen(User::getAd));
		// diyerek ikili metod referans kullanılabilir
		// users.forEach(p -> p.bilgileriGoster());

		System.out.println("-------------------------------------------");
		// id si 3 den büyükleri listeye atalım.liste içindeki userlerin bilgierini
		// getirelim

		List<User> uctenBuyukler = users.stream().filter(p -> p.getId() > 3).toList();
		System.out.println(uctenBuyukler);

		System.out.println("-------------------------------------------");
		// ismi a olanları yeni bir listeye atalım

		List<User> isima = users.stream().filter(p -> p.getAd().equals("a")).toList();
		isima.forEach(User::bilgileriGoster);

		System.out.println("-------------------------------------------");
		// ismi a olanları yeni bir sete atalım

		// .toList() dönen listeyi immutable yapıyo sonra müdahale edemiyoruz
		// .Collectors.toList() immutable değil

		Set<User> isimaSet = users.stream().filter(p -> p.getAd().equals("a")).collect(Collectors.toSet());
		isimaSet.forEach(User::bilgileriGoster);

		System.out.println("-------------------------------------------");
		// her bir user için yeni bir user nesnesi oluşturup isimlerinin yanına BA
		// yazdırıp yeni listeye atalım
		List<User> isimListesi = new ArrayList<User>();
		users.stream().forEach(p -> isimListesi.add(new User(p.getId(), p.getAd() + "AB")));
		isimListesi.forEach(User::bilgileriGoster);

		System.out.println("--------------------------");
		// 2. yol

		List<User> isimListesi2 = users.stream().map(u -> new User(u.getId(), u.getAd() + "AB"))
				.collect(Collectors.toList());
		isimListesi2.forEach(User::bilgileriGoster);

		System.out.println("--------------------------");
		// kullanıcıları aldıkları maaşa göre sırala

		// users.stream().sorted().forEach(User::bilgileriGoster);
		List<User> sirali = users.stream().sorted(Comparator.comparing(User::getSalary).reversed())
				.collect(Collectors.toList());

		sirali.forEach(User::bilgileriGoster);

		System.out.println("--------------------------");
		// isim ve salary değerlerini HashMap yapısına atalım

		Map<Integer, Integer> isimMaasListesi = users.stream().collect(Collectors.toMap(User::getId, User::getSalary));
		isimMaasListesi.forEach((k, v) -> System.out.println(k + " " + v));

		Map<Integer, Integer> isimMaasListesi2 = users.stream()
				.collect(Collectors.toMap(kisi -> kisi.getId(), kisi -> kisi.getSalary()));
		isimMaasListesi2.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
