package lesson012;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ogrenci1 = new Student();
		ogrenci1.name = "berre";
		ogrenci1.numaraVer();

		Student ogrenci2 = new Student();
		ogrenci2.name = "ali";
		ogrenci2.numaraVer();

		Student ogrenci3 = new Student();
		ogrenci3.name = "ayşe";
		ogrenci3.numaraVer();

		System.out.println(ogrenci1.studentNumber);
		System.out.println(ogrenci2.studentNumber);
		System.out.println(ogrenci3.studentNumber);

	}

}
