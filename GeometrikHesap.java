/*
 * Ad Soyad: Ebubekir YILMAZ
 * Öğrenci No: 250541051
 * Tarih: 24.10.2025
 * Açıklama: Geometrik Hesaplayıcı
 * Bu program kullanıcıdan dairenin yarıçapını alır ve
 * dairenin alanı, çevresi, çapı ile küreye ait hacim ve yüzey alanını hesaplar.
 */

import java.util.Scanner;

public class GeometrikHesaplayici {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Sabit değer tanımlama
		final double pi = 3.14159;
		
		System.out.println("===Geometrik Hesaplayıcı===");
		System.out.print("Dairenin yarıçapını girin (cm): ");
		double yaricap = input.nextDouble();
		
		//Hesaplamalar
		
		double alan = pi*yaricap*yaricap;
		double cevre = 2*pi*yaricap;
		double cap = 2*yaricap;
		double hacim = 4.0/3.0 * pi * Math.pow(yaricap, 3);
		double yuzey_alani = 4*pi*yaricap*yaricap;
		
		//Yazdırma
		System.out.println("\nSonuçlar");
		System.out.println("------------------------");
		System.out.printf("Daire Alanı: %.2f cm^2\n", alan);
		System.out.printf("Daire Çevresi: %.2f cm\n", cevre);
		System.out.printf("Daire Çapı: %.2f cm\n", cap);
		System.out.printf("Küre Hacmi: %.2f cm^3\n", hacim);
		System.out.printf("Küre Yüzey Alanı: %.2f cm^2\n", yuzey_alani);
		
		input.close();
		
	}

}
