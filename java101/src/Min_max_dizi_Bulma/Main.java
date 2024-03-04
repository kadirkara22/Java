package Min_max_dizi_Bulma;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
         en büyük en yakın sayıyı bulan programı yazınız.*/

        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};

        // Diziyi sıralayarak daha efektif bir çözüm elde edebiliriz.
        Arrays.sort(dizi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı: ");
        int girilenSayi = scanner.nextInt();

        int enYakinBuyuk = enYakinBuyukSayi(dizi, girilenSayi);
        int enYakinKucuk = enYakinKucukSayi(dizi, girilenSayi);

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);
    }
    // Girilen sayıdan küçük en yakın sayıyı bulan fonksiyon
    public static int enYakinKucukSayi(int[] dizi, int girilenSayi) {
        for (int i = dizi.length - 1; i >= 0; i--) {
            if (dizi[i] < girilenSayi) {
                return dizi[i];
            }
        }
        return Integer.MIN_VALUE; // Girilen sayıdan küçük bir eleman bulunamazsa, minimum int değeri döndürülebilir.
    }

    // Girilen sayıdan büyük en yakın sayıyı bulan fonksiyon
    public static int enYakinBuyukSayi(int[] dizi, int girilenSayi) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > girilenSayi) {
                return dizi[i];
            }
        }
        return Integer.MAX_VALUE; // Girilen sayıdan büyük bir eleman bulunamazsa, maksimum int değeri döndürülebilir.
    }
}
