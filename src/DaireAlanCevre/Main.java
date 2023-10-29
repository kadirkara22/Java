package UcgenAlanCevre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

             𝜋 sayısını = 3.14 alınız.*/
        double pi=3.14,alan,cevre;
        int r;
        Scanner imp=new Scanner(System.in);
        System.out.print("yaricapi giriniz: ");
        r= imp.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Ucgenin Alani: "+alan);
        System.out.println("Ucgenin Cevresi: "+cevre);




    }
}
