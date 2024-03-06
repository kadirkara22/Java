package Palindromik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
          Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

         Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

          Örnek : abba , asa , kavak, kayak
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();
        scanner.close();

        // Palindrom kontrolü
        if (isPalindrom(kelime)) {
            System.out.println(kelime + " bir palindromik kelime.");
        } else {
            System.out.println(kelime + " bir palindromik kelime değil.");
        }


    }
    // Palindrom kontrolü yapan fonksiyon
    private static boolean isPalindrom(String kelime) {
        // Boş veya null kelime palindromiktir
        if (kelime == null || kelime.isEmpty()) {
            return true;
        }

        // Kelimenin başından ve sonundan başlayarak kontrol etme
        int baslangic = 0;
        int son = kelime.length() - 1;

        while (baslangic < son) {

            if (kelime.charAt(baslangic) != kelime.charAt(son)) {
                return false;
            }
            baslangic++;
            son--;
        }

        return true;
    }
}
