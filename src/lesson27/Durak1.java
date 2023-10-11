package lesson27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Durak1 {

	static List<Taksi1> taksiList = new ArrayList<>();
	static Queue<Integer> musteriKuyrugu = new LinkedList<>();

	public Durak1() {
		taksileriOlustur();
		musterileriOlustur();
	}

	public void taksileriOlustur() {
		for (int i = 1; i < 11; i++) {
			taksiList.add(new Taksi1(i));
		}
	}

	public void musterileriOlustur() {
		for (int i = 1; i < 101; i++) {
			musteriKuyrugu.offer(i);
		}
	}

	public void taksileriGoreveGonder() {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(taksiList.get(i));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			thread.start();
		}
	}

	public static void main(String[] args) {
		Durak1 durak = new Durak1();
		durak.taksileriGoreveGonder();
	}
}
