package questions;

import java.util.Scanner;

/*
E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri olduguna bakiniz. 
Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun hazirlayiniz. 
(5 tanesi kullanicidan veri alinarak , 5 tanesi parametreli constructor kullanilarak, 
5 tanesi bos constructor kullanilarak olmali)
*/

public class ParametreliConstractor {

	int camera;
	double ekran;
	String renk;
	String model;
	boolean isAndroid = true;

	public ParametreliConstractor(int camera, double ekran, String renk,  String model, boolean isAndroid) {

		this.camera = camera;
		this.ekran = ekran;
		this.renk = renk;
		this.model = model;
		this.isAndroid = isAndroid;

	}

	public ParametreliConstractor(String renk, String model) {

		this.renk = renk;
		this.model = model;

	}

	public ParametreliConstractor(int camera, String renk, double ekran) {

		this.camera = camera;
		this.renk = renk;
		this.ekran = ekran;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Camera cozunurlugunu giriniz (int)?");
		int camera = scan.nextInt();

		System.out.println("Ekran boyutunu giriniz(double)?");
		double ekran=scan.nextDouble();
		
		System.out.println("Renk bilgilerini girniz(String)?");
		String renk=scan.nextLine();
				
		System.out.println("Model giriniz:");
		String model=scan.nextLine();
	
		ParametreliConstractor telefon1 = new ParametreliConstractor(camera, ekran, renk,model, true); // Object1
		ParametreliConstractor telefon2 = new ParametreliConstractor(renk, "128Pro"); // Object2
		ParametreliConstractor telefon3 = new ParametreliConstractor("Kirmizi", "156"); // Object3
		ParametreliConstractor telefon4 = new ParametreliConstractor(128, "Yesil", 11.2); // Object4
		ParametreliConstractor telefon5 = new ParametreliConstractor("Zeytin", "128ProMax"); // Object5

		System.out.println("Camera: "+telefon1.camera+"MP-"  +""+ telefon1.ekran+ telefon1.renk + telefon1.model + telefon1.isAndroid); 
																													
		System.out.println(telefon2.renk + telefon2.model);
		System.out.println(telefon3.renk + telefon3.model);
		System.out.println(telefon4.camera + telefon4.renk + telefon4.ekran);
		System.out.println(telefon5.renk + telefon5.model);

	}
}
