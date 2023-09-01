package lesson012;

import java.util.Scanner;

/*
 * öğrencilerimizn bir numarası ve bir ismi olsun
 * 
 * daha sonra kayıt metodu yazalım
 * çıktısı ---> berre adlı öğrenci başarı ile kaydedildi.öğr no = 1
 *              berre adlı öğrenci başarı ile kaydedildi.öğr no = 2
 *              
 *ogrencikayit2 metodu oluştur
 *dışarıdan ismi al öğrenci oluşturup numarasını atasın bize öğrenciyi dönsün
 *              
 * 
 */

public class Student {

	String name;
	int studentNumber;
	static int index;

	public void numaraVer() {
		index++;
		studentNumber = index;
		System.out.println(name + " adlı öğrenci kaydedildi.öğrneci no = " + studentNumber);
	}

	public static Student ogrenciKayit2(String isim) {

		Student student = new Student();
		student.name = isim;
		student.numaraVer();
		return student;

	}
}
