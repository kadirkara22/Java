package min_max;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve
         bu sayıları ekrana yazan programı yazın.*/
        int count;
        int enBuyuk,enKucuk;
        int number;
        Scanner inp=new Scanner(System.in);
        System.out.println("kaç tane sayı gireceksiniz: ");
        count=inp.nextInt();
        System.out.println("1. Sayıyı giriniz: ");
        number=inp.nextInt();
        enBuyuk=number;
        enKucuk=number;
          for (int i=2;i<=count;i++){
              System.out.println(i+". Sayıyı giriniz: ");
              number=inp.nextInt();
         if(enKucuk>number){
               enKucuk=number;
         }
           if(enBuyuk<number){
               enBuyuk=number;
           }

          }
        System.out.println("en kücük sayı: "+enKucuk);
        System.out.println("en büyük sayı: "+enBuyuk);
    }
}
