/*
 * Ad Soyad: Ebubekir Yılmaz
 * Öğrenci No: 250541051
 * Tarih: 24.10.2025
 * Açıklama: Öğrenci Bilgi Sistemi
 * Bu program kullanıcıdan öğrenci bilgilerini alır ve
 * düzenli bir formatta ekrana yazdırır.
 */

import java.util.Scanner;

public class ÖğrenciBilgi {
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Öğrenci Bilgi Sistemi");
		
		System.out.print("Adınızı Girin: ");
		String ad = inputScanner.next();
		
		System.out.print("Soyadınızı Girin: ");
		String soyad = inputScanner.next();
		
		System.out.print("Öğrenci Numaranız: ");
		int öğrencino = inputScanner.nextInt();
		
		System.out.print("Yaşınız: ");
		int yaş = inputScanner.nextInt();
		
		System.out.print("GPA (0.00-4.00): ");
		double gpa = inputScanner.nextDouble();
		
		System.out.println("\n=== ÖĞRENCİ BİLGİ SİSTEMİ ===");
		System.out.printf("Ad Soyad: %s %s\n", ad, soyad);
		System.out.printf("Öğrenci No: %d\n", öğrencino);
		System.out.printf("Yaş: %d\n", yaş);
		System.out.printf("GPA: %.2f\n", gpa);
		System.out.printf("Durum: Başarılı Öğrenci");
		
		inputScanner.close();
		
	}

}
