package lesson27;

public class MainKosucu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kosucu kosucu1=new Kosucu("Ahmet");
		Kosucu kosucu2=new Kosucu("mehmet");
		
		Thread thread1=new Thread(kosucu1);
		Thread thread2=new Thread(kosucu2);
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (kosucu1.getSure()>kosucu2.getSure()) {
			System.out.println("kazanan :"+kosucu1.getName());
		}else if (kosucu1.getSure()<kosucu2.getSure()) {
			System.out.println("kazanan :"+kosucu2.getName());
		}else {
			System.out.println("berabere");
		}
		
		
	}

}
