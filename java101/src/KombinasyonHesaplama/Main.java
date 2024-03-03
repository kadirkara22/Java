package KombinasyonHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların
         sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

          Java ile kombinasyon hesaplayan program yazınız.

           Kombinasyon formülü
            C(n,r) = n! / (r! * (n-r)!)
            */
        Scanner scanner = new Scanner(System.in);

        System.out.print("n'i girin: ");
        int n = scanner.nextInt();

        System.out.print("r'yi girin: ");
        int r = scanner.nextInt();

        if (r <= n) {
            long kombinasyon = kombinasyonHesapla(n, r);
            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);
        } else {
            System.out.println("Hata: r, n'den büyük olamaz.");
        }
    }

    // Faktöriyel hesaplayan metot
    public static long faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        } else {
            return sayi * faktoriyel(sayi - 1);
        }
    }
    // Kombinasyon hesaplayan metot
    public static long kombinasyonHesapla(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

}
