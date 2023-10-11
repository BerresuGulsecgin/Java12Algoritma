package lesson27;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TaksiMain {
	static Queue<Integer> musteriKuyrugu = new LinkedList<>();

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			musteriKuyrugu.add(i);
		}

		List<Taksi> taksiler = new ArrayList<Taksi>();
		for (int i = 0; i < 10; i++) {
			taksiler.add(new Taksi((i + 1)));
		}

		for (Taksi taksi : taksiler) {
			taksi.start();
		}
	}
}
