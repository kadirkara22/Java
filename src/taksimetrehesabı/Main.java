package taksimetrehesabı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

            Taksimetre KM başına 2.20 TL tutmaktadır.
            Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
            Taksimetre açılış ücreti 10 TL'dir.

         */
        int km;
        double perKm=2.20,total,staredTutar=10;

        Scanner imp=new Scanner(System.in);
        System.out.print("Mesafeyi Km cinsinden giriniz: ");
        km=imp.nextInt();
        total=perKm*km;
        total+=staredTutar;
        total=total>20 ? total : 20;

        System.out.println("Toplam tutar: "+total);
    }
}
