package lesoon011;

public class ReferansTypevePrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 4;

		System.out.println(a);
		System.out.println(b);

		a = b;
		b = 12;
		System.out.println(a);
		System.out.println(b);

		System.out.println("*******************************");

		Integer sayi1 = 10;
		Integer sayi2 = 20;

		sayi1 = sayi2;
		sayi2 = 30;

		System.out.println(sayi1);
		System.out.println(sayi2);
		
		String [] sehirler = {"Ankara","Istanbul","İzmir"};
		String [] sehirler2 = {"Bursa","konya","Mersin"};
		
		System.out.println(sehirler[0]);
		System.out.println(sehirler2[0]);
		
		sehirler2=sehirler;
		
		System.out.println(sehirler2[0]);
		
		sehirler[0]="Bolu";
		System.out.println(sehirler2[0]);
		
		sehirler[1]="Edirne";
		System.out.println(sehirler2[1]);
		

	}

}
