package UcakbiletiFiyatiHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
        ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
*Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
*Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
*Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
*Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
*/
        int age,km,yolculukTip;
        double toplamTutar,discountTutar,ageDiscount,roundTripDiscount;
        Scanner inp=new Scanner(System.in);
        System.out.print("Gitmek istediğiniz mesafeyi giriniz(km): ");
        km=inp.nextInt();
        System.out.print("Yasiniz giriniz: ");
        age=inp.nextInt();
        System.out.print("Yolculuk tipini giriniz Tek yon ise 1' e, Cift yon ise 2' ye basiniz: ");
        yolculukTip=inp.nextInt();
        toplamTutar=km*0.10;

        if(km>0 &&( yolculukTip==1 || yolculukTip==2) && age>0){
          if(yolculukTip==1){
           if(age<12){
               ageDiscount=toplamTutar*0.50;
               discountTutar=toplamTutar-ageDiscount;
               System.out.print("Toplam Tutar: "+discountTutar);
           }else if((age>=12) && (age<=24)){
                  ageDiscount=toplamTutar*0.10;
                  discountTutar=toplamTutar-ageDiscount;
                  System.out.print("Toplam Tutar: "+discountTutar);
           }else if(age>=65){
               ageDiscount=toplamTutar*0.30;
               discountTutar=toplamTutar-ageDiscount;
               System.out.print("Toplam Tutar: "+discountTutar);
           }else{
                  System.out.print("Toplam Tutar: "+toplamTutar);
              }
          }else{
              if(age<12){
                  ageDiscount=toplamTutar*0.50;
                  discountTutar=toplamTutar-ageDiscount;
                  roundTripDiscount=discountTutar*0.20;
                  System.out.print("Toplam Tutar: "+(discountTutar-roundTripDiscount)*2);
              }else if((age>=12) && (age<=24)){
                  ageDiscount=toplamTutar*0.10;
                  discountTutar=toplamTutar-ageDiscount;
                  roundTripDiscount=discountTutar*0.20;
                  System.out.print("Toplam Tutar: "+(discountTutar-roundTripDiscount)*2);
              }else if(age>=65){
                  ageDiscount=toplamTutar*0.30;
                  discountTutar=toplamTutar-ageDiscount;
                  roundTripDiscount=discountTutar*0.20;
                  System.out.print("Toplam Tutar: "+(discountTutar-roundTripDiscount)*2);
              }else{
                  System.out.print("Toplam Tutar: "+(toplamTutar)*2);
              }
          }
        }else{
            System.out.println("Hatalı veri girdiniz");
        }

    }
}
