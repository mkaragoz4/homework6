package questions;

import java.util.Scanner;

/*
E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri olduguna bakiniz. 
Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun hazirlayiniz. 
(5 tanesi kullanicidan veri alinarak , 5 tanesi parametreli constructor kullanilarak, 
5 tanesi bos constructor kullanilarak olmali)
*/

public class VeriAlinanConstructor {
	
	int camera;
	double ekran;
	String renk;
	String model;
	boolean isAndroid = true;
	
	
	
	public VeriAlinanConstructor (int camera, double ekran, String renk,  String model, boolean isAndroid) {

		this.camera=camera;
		this.ekran=ekran;
		this.renk=renk;
		this.model=model;
		this.isAndroid=isAndroid;
	}
	
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Camera cozunurlugunu giriniz (int)?");
		int camera = scan.nextInt();

		System.out.println("Ekran boyutunu giriniz(double)?");
		double ekran=scan.nextDouble();
		
		System.out.println("Renk bilgilerini girniz(String)?");
		String renk=scan.nextLine();
				
		System.out.println("Model giriniz:");
		String model=scan.nextLine();
		
		System.out.println("Isletim sistemini giriniz:");
		boolean isAndroid=scan.hasNextBoolean();
		
		scan.close();
		
		
		
		
		VeriAlinanConstructor telefon11 = new VeriAlinanConstructor(camera, ekran, renk,model, isAndroid); // Object11
		VeriAlinanConstructor telefon12 = new VeriAlinanConstructor(camera, ekran, renk,model, isAndroid); // Object12
		VeriAlinanConstructor telefon13 = new VeriAlinanConstructor(camera, ekran, renk,model, isAndroid); // Object13
		VeriAlinanConstructor telefon14 = new VeriAlinanConstructor(camera, ekran, renk,model, isAndroid); // Object14
		VeriAlinanConstructor telefon15 = new VeriAlinanConstructor(camera, ekran, renk,model, isAndroid); // Object15
	
	
	System.out.println(telefon11.camera);
	
	}

	
	
}
