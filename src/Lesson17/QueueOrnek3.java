package Lesson17;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOrnek3 {

	public static void main(String[] args) {
		// hasta sınıfı olsun
		//önceliğe göre sırala
		//apandist ise en yüksek öncelik
		//yanik ise orta
		//baş ağrısı ise en büşük
		
		//isim, şikayet
		
		Queue<Hasta> hastalar = new PriorityQueue<>();
		hastalar.add(new Hasta("a", Sikayet.APANDIST));
		hastalar.add(new Hasta("b", Sikayet.KULAK));
		hastalar.add(new Hasta("c", Sikayet.YANIK));
		hastalar.add(new Hasta("d", Sikayet.APANDIST));
		hastalar.add(new Hasta("d", Sikayet.BOGAZ));
		hastalar.add(new Hasta("d", Sikayet.YANIK));
		hastalar.add(new Hasta("d", Sikayet.APANDIST));
		hastalar.add(new Hasta("d", Sikayet.KULAK));
		
		while (hastalar.iterator().hasNext()) {
			System.out.println(hastalar.poll());
		}

	}

}
