package recursiveUstAlma;

import java.util.Scanner;

public class Main {
    static boolean asalKontrol(int sayi, int bölen) {
        if (bölen == 1) {
            return true;
        } else {
            if (sayi % bölen == 0) {
                return false;
            } else {
                return asalKontrol(sayi, bölen - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi < 2) {
            System.out.println("Asal sayı değildir.");
        } else {
            boolean asal = asalKontrol(girilenSayi, girilenSayi / 2);
            if (asal) {
                System.out.println(girilenSayi + " asal bir sayıdır.");
            } else {
                System.out.println(girilenSayi + " asal bir sayı değildir.");
            }
        }
    }
}
