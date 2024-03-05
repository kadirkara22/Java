package Dizi_eleman_siralama;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
         Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
         Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
         */

        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int boyut= inp.nextInt();
        int[] dizi=new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz : ");
        System.out.print("1. Elemanı : ");
        int eleman1= inp.nextInt();
        dizi[0]=eleman1;
        for (int i=2;i<=dizi.length;i++){
            System.out.print(i+". Elemanı : ");
            int eleman2= inp.nextInt();
            dizi[i-1]=eleman2;
        }
        Arrays.sort(dizi);
        //System.out.println(Arrays.toString(dizi));
        System.out.print("Sıralama : ");
        for (int i : dizi){
            System.out.print(i+" ");
        }

    }
}
