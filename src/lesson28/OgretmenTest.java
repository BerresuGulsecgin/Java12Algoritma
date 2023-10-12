package lesson28;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OgretmenTest {

	public static void main(String[] args) {
		BufferedReader bufferedReader;
		try {
			bufferedReader = new BufferedReader(new FileReader("ogrenci.txt"));

			Ogretmen ogretmen = new Ogretmen("ogr1", bufferedReader);
			Ogretmen ogretmen2 = new Ogretmen("ogr2", bufferedReader);

			ogretmen.start();
			ogretmen2.start();
			
//			try {
//				ogretmen.join();
//				ogretmen2.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
