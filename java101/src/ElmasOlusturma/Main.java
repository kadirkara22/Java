package ElmasOlusturma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini girin (tek sayı olmalı): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Lütfen tek bir sayı girin.");
        } else {
            // Elmasın üst kısmı
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }

            // Elmasın alt kısmı
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j < (n - i); j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }

    }
}
