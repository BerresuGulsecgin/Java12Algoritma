package lesson27;

public class Calisan extends Thread {

	public String name;

	public Calisan(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " Çalışır");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}

//run metodu 10 kere dönsün ismini yazdırsın işleme devam diye yazıdr
//her çalışanda 1 sn gecikmeli çalışsın
