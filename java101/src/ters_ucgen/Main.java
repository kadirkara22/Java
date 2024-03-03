package ters_ucgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
         yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.*/

       Scanner inp=new Scanner(System.in);
        System.out.print("Basamak sayisi giriniz: ");
        int number=inp.nextInt();

        for(int i=number;i>0;i--){
            for (int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
