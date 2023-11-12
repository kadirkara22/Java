package DortVeBeskuvvetleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
         ekrana yazdıran programı yazıyoruz.*/

                Scanner scanner = new Scanner(System.in);

                System.out.print("Bir sayı girin: ");
                int sayi = scanner.nextInt();

                System.out.println("4'ün kuvvetleri:");
                for (int i = 1; Math.pow(4, i) <= sayi; i++) {
                    System.out.println(Math.pow(4, i));
                }

                System.out.println("5'in kuvvetleri:");
                for (int i = 1; Math.pow(5, i) <= sayi; i++) {
                    System.out.println(Math.pow(5, i));
                }

    }
}
