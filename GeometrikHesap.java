/*
 * Ad Soyad: Ebubekir YILMAZ
 * Öğrenci No: 250541051
 * Tarih: 24.10.2025
 * Açıklama: Geometrik Hesaplayıcı
 */

import java.util.Scanner;

public class GeometrikHesaplayıcı {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Sabit değer tanımlama
		final double pi = 3.14159;
		
		System.out.println("===Geometrik Hesaplayıcı===");
		System.out.print("Dairenin yarıçapını girin (cm): ");
		double yarıçap = input.nextDouble();
		
		//Hesaplamalar
		
		double alan = pi*yarıçap*yarıçap;
		double çevre = 2*pi*yarıçap;
		double çap = 2*yarıçap;
		double hacim = 4.0/3.0 * pi * Math.pow(yarıçap, 3);
		double yüzey_alanı = 4*pi*yarıçap*yarıçap;
		
		//Yazdırma
		System.out.println("\nSonuçlar");
		System.out.println("------------------------");
		System.out.printf("Daire Alanı: %.2f cm^2\n", alan);
		System.out.printf("Daire Çevresi: %.2f cm\n", çevre);
		System.out.printf("Daire Çapı: %.2f cm\n", çap);
		System.out.printf("Küre Hacmi: %.2f cm^3\n", hacim);
		System.out.printf("Küre Yüzey Alanı: %.2f cm^2\n", yüzey_alanı);
		
		input.close();
		
	}

}

