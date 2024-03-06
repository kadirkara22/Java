package Sayi_tahmin_oyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          /*
          Java dilinde programın 0-100 arasında rastgele seçtiği
          bir sayıyı kullanıcının tahmin etmesini istediğimiz
          bir "Sayı Tahmin Oyunu" yapıyoruz.
          */

        Random rand = new Random();
        int rastgeleSayi = rand.nextInt(100);
        //int rastgeleSayi = (int) (Math.random() * 100) + 1;

        // Kullanıcıdan tahminleri almak için bir Scanner oluşturma
        Scanner scanner = new Scanner(System.in);

        System.out.println("0 ile 100 arasında bir sayıyı tahmin edin. Toplam 5 tahmin hakkınız var.");

        int tahmin;
        int tahminHakki = 5;
        boolean dogruTahmin = false;

        // Kullanıcının 5 tahmin hakkı olduğu döngüyü sürdürme
        while (tahminHakki > 0 && !dogruTahmin) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin < 0 || tahmin > 100) {
                System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı deneyin. Kalan tahmin hakkınız: " + (--tahminHakki));
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı deneyin. Kalan tahmin hakkınız: " + (--tahminHakki));
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz. Sayı: " + rastgeleSayi);
                dogruTahmin = true;
            }
        }

        // Tahmin hakkı bittiğinde ve doğru tahmin yapılmadığında mesaj verme
        if (!dogruTahmin) {
            System.out.println("Üzgünüm, tahmin hakkınız bitti. Doğru sayı: " + rastgeleSayi);
        }

        // Scanner'ı kapatma
        scanner.close();
    }
}
