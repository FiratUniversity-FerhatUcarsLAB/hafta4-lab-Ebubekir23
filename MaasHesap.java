/*
 * Ad Soyad: Ebubekir Yılmaz
 * Öğrenci No: 250541051
 * Tarih: 24.10.2025
 * Açıklama: Maaş Hesaplama Sistemi
 */

import java.util.Scanner;

public class MaaşHesaplamaSistemi {
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		//Sabit Oranlar
		final double SGK_ORANI = 0.14;
		final double GELİR_VERGİSİ_ORANI = 0.15;
		final double DAMGA_VERGİSİ_ORANI = 0.00759;
		
		System.out.println("=== MAAŞ HESAPLAMA SİSTEMİ ===");
		
		System.out.print("Çalışan Ad Soyad: ");
		String adSoyad = inputScanner.nextLine();
		
		System.out.print("Aylık Brüt Maaş (TL): ");
		double brütMaaş = inputScanner.nextInt();
		
		System.out.print("Haftalık Çalışma Saati: ");
		int haftalikSaat = inputScanner.nextInt();
		
		System.out.print("Mesai Saati: ");
		int mesaiSaat = inputScanner.nextInt();
		
		
		//Gelirler
		double mesaiÜcret = (brütMaaş/160) * mesaiSaat * 1.5;
		double toplamGelir = brütMaaş + mesaiSaat;
		
		
		//Kesintiler
		double sgk = toplamGelir * SGK_ORANI;
		double gelirVergisi = toplamGelir * GELİR_VERGİSİ_ORANI;
		double damgaVergisi = toplamGelir * DAMGA_VERGİSİ_ORANI;
		double toplamKesinti = sgk + gelirVergisi + damgaVergisi;
		
		
		//Net Maaş
		double netMaaş = toplamGelir - toplamKesinti;
		
		
		//İstatistikler
		double kesintiOranı = (toplamKesinti/toplamGelir) * 100;
		double saatlikNet = netMaaş/176;
		double günlükNet = netMaaş/22;
		
		
		//Çıktı
		System.out.println("\n=============");
		System.out.println("MAAŞ BORDOSU");
		System.out.println("=============");
		
		System.out.println("Çalışan: " + adSoyad);
		
		System.out.println("GELİRLER: ");
		System.out.printf("Brüt Maaş: %.2f TL\n", brütMaaş);
		System.out.printf("Mesai Üceti (%d saat): %.2f TL\n", mesaiSaat, mesaiÜcret);
		System.out.println("--------------");
		System.out.printf("TOPLAM GELİR: %.2f TL\n\n", toplamGelir);
		
		System.out.println("KESİNTİLER: ");
		System.out.printf("SGK Kesintisi (%.1f%%): %.2f TL\n", SGK_ORANI*100, sgk);
		System.out.printf("Gelir Vergisi (%.1f%%): %.2f TL\n", GELİR_VERGİSİ_ORANI*100, gelirVergisi);
		System.out.printf("Damga Vergisi (%.1f%%): %.2f TL\n", DAMGA_VERGİSİ_ORANI*100, damgaVergisi);
		System.out.println("---------------------------");
		System.out.printf("TOPLAM KESİNTİ (%.1f%%): %.2f TL\n", kesintiOranı, toplamKesinti);
		
		System.out.printf("NET MAAŞ: %.2f TL\n", netMaaş);
		System.out.println("-----------------------------");
		System.out.printf("Kesinti Oranı: %.1f%%\n", kesintiOranı);
		System.out.printf("Saatlik Net Kazanç: %.2f TL\n", saatlikNet);
		System.out.printf("Günlük Net Kazanç: %.2f TL\n", günlükNet);
		System.out.println("-----------------------------");
		
		inputScanner.close();
		
	}
}
