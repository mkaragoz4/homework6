package questions;

/*
E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri olduguna bakiniz. 
Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun hazirlayiniz. 
(5 tanesi kullanicidan veri alinarak , 5 tanesi parametreli constructor kullanilarak, 
5 tanesi bos constructor kullanilarak olmali)
*/

public class BosConstractor {

	int camera = 12;
	double ekran = 12.6;
	String renk = "Kırmızı";
	String model = "Promax";
	boolean isAndroid = true;

	public BosConstractor() {

	}

	public static void main(String[] args) {

		BosConstractor telefon6 = new BosConstractor();
		BosConstractor telefon7 = new BosConstractor();
		BosConstractor telefon8 = new BosConstractor();
		BosConstractor telefon9 = new BosConstractor();
		BosConstractor telefon10 = new BosConstractor();

		System.out.println(telefon6.camera);
		System.out.println(telefon7.ekran);
		System.out.println(telefon8.camera + telefon8.ekran + telefon8.renk + telefon8.model + telefon8.isAndroid);
		System.out.println(telefon9.renk);
		System.out.println(telefon10.camera);
		System.out.println(telefon8.model);

	}

}