package TamBolenBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
         3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
         int lastNumber,bolenNumber;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        lastNumber=inp.nextInt();
        System.out.print("Bölmek istediğiniz sayıyı girniz: ");
        bolenNumber=inp.nextInt();

        for (int i=1; i<=lastNumber;i++){
            if(i%bolenNumber==0){
                System.out.print(i+",");
            }
        }
    }
}
