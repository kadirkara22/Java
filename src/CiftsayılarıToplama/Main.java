package CiftsayılarıToplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
         ve girilen değerlerden çift ve 4'ün katları olan sayıları
          toplayıp ekrana basan programı yazıyoruz.*/

        int sayi1,total=0;
        Scanner inp=new Scanner(System.in);

        do{
            System.out.print("Sayı Giriniz: ");
            sayi1=inp.nextInt();
if( sayi1%4==0){
    total+=sayi1;
}
        }while(sayi1%2!=1);
        System.out.print("Toplam: "+total);
    }
}
