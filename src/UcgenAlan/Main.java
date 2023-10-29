package UcgenAlan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Üç kenar uzunluğunu kullanıcıdan aldığınız
        üçgenin alanını hesaplayan programı yazınız.*/

        int a,b;
        double c,alan;

        Scanner kenar=new Scanner(System.in);
        System.out.print("a kenarını giriniz: ");
        a=kenar.nextInt();
        System.out.print("b kenarını giriniz: ");
        b=kenar.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("c kenar uzunluğu: "+c);
        alan=(a*b)/2;
        System.out.println("Ucgenin alanı: "+alan);



    }
}
