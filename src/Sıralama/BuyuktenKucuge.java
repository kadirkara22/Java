package Sıralama;

import java.util.Scanner;

public class BuyuktenKucuge {
    public static void main(String[] args) {
        /*Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.*/
int a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz: ");
        a= inp.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        b= inp.nextInt();
        System.out.print("ucuncu sayıyı giriniz: ");
        c= inp.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.print("a>b>c");

            }else{
                System.out.print("a>c>b");
            }
        }else if(b>a && b>c){
            if(a>c){
                System.out.print("b>a>c");
            }else{
                System.out.print("b>c>a");
            }
        }else{
            if(a>b){
                System.out.print("c>a>b");
            }else{
                System.out.print("c>b>a");
            }
        }

    }
}
