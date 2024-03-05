package array_count;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Java dilinde, dizideki elemanların kaç kez tekrar edildiğini
         yani frekanslarını bulan programı yazınız.*/

        int[] dizi = {10, 20, 10, 10, 10, 20, 5, 20,5,20};

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        System.out.println("Tekrar Sayilari");
        for (int i = 0; i < dizi.length; i++) {
            int sayi = dizi[i];
            int count = 1;

            // Eğer bu eleman daha önce işlenmediyse, frekansını hesapla
            for (int j = i + 1; j < dizi.length; j++) {
                if (sayi == dizi[j]) {
                    count++;
                }
            }

            // Her bir elemanın frekansını ekrana yazdır
            if (count > 0) {
                System.out.println(sayi + " sayisi " + count + " kere tekrar edildi.");

                // Aynı elemanın tekrar sayılarını bir daha yazdırmamak için i'yi güncelle
                i += count -1;
            }
        }
    }
}
