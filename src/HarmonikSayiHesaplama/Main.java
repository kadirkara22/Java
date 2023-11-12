package HarmonikSayiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile girilen sayının harmonik serisini bulan program yazacağız.*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("Harmonik serisi için bir sayı girin: ");
        int n = scanner.nextInt();

        double toplam = 0.0;

        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        System.out.println("Harmonik serisi toplamı: " + toplam);
    }
}
