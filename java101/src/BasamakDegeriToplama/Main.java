package BasamakDegeriToplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.*/
        int number,modNumber,total=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number=inp.nextInt();
        while (number!=0){
            modNumber=number%10;
            total+=modNumber;
            number/=10;

        }
        System.out.print("Toplam: "+total);
    }
}
