package NotHesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
        derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp
        ekrana bastırılan programı yazın.*/
        int mat,fizik,kimya,turkce,tarih,muzik ;
        Scanner inp =new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat=inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=inp.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih=inp.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik=inp.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc =toplam/6;
        System.out.println("Ortalamanız: "+ sonuc);
        boolean kosul1=sonuc>=60;
        System.out.print(kosul1 ? "Gecti" : "Kaldi");
    }
}
