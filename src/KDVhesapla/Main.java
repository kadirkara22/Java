package KDVhesapla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp
    ekrana bastıran programı yazın.Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
     tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/


        double tutar,kdvOran,kdv1Oran=0.18,kdv2Oran=0.08,kdvTutar,kdvliTutar;
        double ustSinir=1000;
        Scanner inp=new Scanner(System.in);
        System.out.print("Ücret tutarınızı giriniz : ");
        tutar=inp.nextDouble();
        kdvOran=tutar < ustSinir ? kdv1Oran :kdv2Oran;

        kdvTutar=(tutar>0 && tutar <ustSinir) ? tutar*kdv1Oran : tutar*kdv1Oran ;
        kdvliTutar=tutar+kdvTutar;
        System.out.println("Kdv'siz tutar : "+tutar);
        System.out.println("Kdv oranı : "+kdvOran);
        System.out.println("Kdv tutarı : "+kdvTutar);
        System.out.println("Kdv'li tutar : "+kdvliTutar);
    }
}
