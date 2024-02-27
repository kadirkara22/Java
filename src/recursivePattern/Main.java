package recursivePattern;

import java.util.Scanner;

public class Main {

    static void ciktiUret(int n) {
        System.out.print(n + " ");

        if (n > 0) {
            ciktiUret(n - 5);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        /*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki
         kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

        Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
        Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
        Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
        Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        ciktiUret(n);

    }
}
