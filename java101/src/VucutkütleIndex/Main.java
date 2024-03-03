package VucutkütleIndex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
         Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

                 Formül
               Index=Kilo (kg) / (Boy(m) * Boy(m))*/

        int kg;
        double boy,kIndex;

        Scanner inp=new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
        boy=inp.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kg=inp.nextInt();
        kIndex=kg/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz: "+ kIndex);
        if(kIndex<18.5){
            System.out.print("İdeal kilonun altında");
        }else if(kIndex<24.9){
            System.out.print("Ideal kiloda");
        }else if(kIndex>25 && kIndex<29.9){
            System.out.print("İdeal kilonun ustunde");
        }else if(kIndex>30 && kIndex<39.9){
            System.out.print("Ideal kilonun çok üstünde (obez)");
        }else if(kIndex>40){
            System.out.print("İdeal kilonun çok üstünde (morbid obez)");
        }


    }
}
