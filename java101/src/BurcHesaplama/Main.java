package BurcHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

*/

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum gününüzün gününü giriniz: ");
        int gun = inp.nextInt();

        System.out.print("Doğum ayınızı rakam olarak giriniz (1-12): ");
        int ay = inp.nextInt();
        if ((ay == 1 && gun >= 1 && gun <= 19) || (ay == 12 && gun >= 22 && gun <= 31)) {
            System.out.println("Oğlak Burcu");
        } else if ((ay == 1 && gun >= 20 && gun <= 31) || (ay == 2 && gun >= 1 && gun <= 18)) {
            System.out.println("Kova Burcu");
        } else if ((ay == 2 && gun >= 19 && gun <= 29) || (ay == 3 && gun >= 1 && gun <= 20)) {
            System.out.println("Balık Burcu");
        } else if ((ay == 3 && gun >= 21 && gun <= 31) || (ay == 4 && gun >= 1 && gun <= 19)) {
            System.out.println("Koç Burcu");
        } else if ((ay == 4 && gun >= 20 && gun <= 30) || (ay == 5 && gun >= 1 && gun <= 20)) {
            System.out.println("Boğa Burcu");
        } else if ((ay == 5 && gun >= 21 && gun <= 31) || (ay == 6 && gun >= 1 && gun <= 20)) {
            System.out.println("İkizler Burcu");
        } else if ((ay == 6 && gun >= 21 && gun <= 30) || (ay == 7 && gun >= 1 && gun <= 22)) {
            System.out.println("Yengeç Burcu");
        } else if ((ay == 7 && gun >= 23 && gun <= 31) || (ay == 8 && gun >= 1 && gun <= 22)) {
            System.out.println("Aslan Burcu");
        } else if ((ay == 8 && gun >= 23 && gun <= 31) || (ay == 9 && gun >= 1 && gun <= 22)) {
            System.out.println("Başak Burcu");
        } else if ((ay == 9 && gun >= 23 && gun <= 30) || (ay == 10 && gun >= 1 && gun <= 22)) {
            System.out.println("Terazi Burcu");
        } else if ((ay == 10 && gun >= 23 && gun <= 31) || (ay == 11 && gun >= 1 && gun <= 21)) {
            System.out.println("Akrep Burcu");
        } else if ((ay == 11 && gun >= 22 && gun <= 30) || (ay == 12 && gun >= 1 && gun <= 21)) {
            System.out.println("Yay Burcu");
        } else {
            System.out.println("Geçersiz tarih girdiniz.");
        }
    }
}

