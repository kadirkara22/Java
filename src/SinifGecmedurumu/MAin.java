package SinifGecmedurumu;

import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {

        /*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

          Geçme Notu : 55
          Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/
        int matematik,fizik,kimya,turkce,muzik,avarage,dersTotalCount=0,dersTotal=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik Notunuzu giriniz: ");
        matematik=inp.nextInt();
        System.out.print("Fizik Notunuzu giriniz: ");
        fizik=inp.nextInt();
        System.out.print("Kimya Notunuzu giriniz: ");
        kimya=inp.nextInt();
        System.out.print("Turkce Notunuzu giriniz: ");
        turkce=inp.nextInt();
        System.out.print("Muzik Notunuzu giriniz: ");
        muzik=inp.nextInt();

        if (matematik >0 && matematik < 100) {
            dersTotalCount++;
            dersTotal+=matematik;

        }



        if (fizik > 0 && fizik < 100) {
            dersTotalCount++;
            dersTotal+=fizik;
        }

        if (kimya > 0 && kimya < 100) {
            dersTotalCount++;
            dersTotal+=kimya;
        }

        if (turkce > 0 && turkce < 100) {
            dersTotalCount++;
            dersTotal+=turkce;
        }


        if (muzik >0 && muzik <100) {
            dersTotalCount++;
            dersTotal+=muzik;
        }

            avarage=dersTotal/dersTotalCount;
            System.out.print("Ortalamanız: "+avarage);

            if(avarage>=55){
                System.out.print("Sınıfı geçtiniz");
            }else{
                System.out.print("Sınıfta kaldınız. Seneye tekrar görüsürüz");
            }



    }
}
