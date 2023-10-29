package ManavKasaProgramı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile kullanıcıların manavdan almış oldukları
        ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
*/
        int armut,elma,domates,muz,patlıcan;
        double armutFiyat=2.14,elmaFiyat=3.67,
                domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5,toplamFiyat,
        totalArmutFiyat,totalElmaFiyat,totalDomatesFiyat,totalMuzFiyat,totalPatlicanFiyat;
                ;

        Scanner inp=new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        armut=inp.nextInt();
        System.out.print("Elma kaç kilo: ");
        elma=inp.nextInt();
        System.out.print("Domates kaç kilo: ");
        domates=inp.nextInt();
        System.out.print("Muz kaç kilo: ");
        muz=inp.nextInt();
        System.out.print("Patlıcan kaç kilo: ");
        patlıcan=inp.nextInt();
        totalArmutFiyat=armut*armutFiyat;
       totalElmaFiyat=elma*elmaFiyat;
       totalDomatesFiyat=domates*domatesFiyat;
       totalMuzFiyat=muz*muzFiyat;
       totalPatlicanFiyat=patlıcan*patlicanFiyat;
       toplamFiyat=totalArmutFiyat+totalElmaFiyat+totalDomatesFiyat+totalMuzFiyat+totalPatlicanFiyat;
        System.out.println("Armut "+armut+" kilo "+totalArmutFiyat+" TL");
        System.out.println("Elma "+elma+" kilo "+totalElmaFiyat+" TL");
        System.out.println("Domates "+domates+" kilo "+totalDomatesFiyat+" TL");
        System.out.println("Muz "+muz+" kilo "+totalMuzFiyat+" TL");
        System.out.println("Patlıcan "+patlıcan+" kilo "+totalPatlicanFiyat+" TL");

        System.out.println("Toplam Tutar :"+toplamFiyat+" TL");

    }
}
