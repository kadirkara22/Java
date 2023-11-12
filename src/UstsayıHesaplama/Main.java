package UstsayıHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
         "For Döngüsü" kullanarak yapınız.*/
        int number1,number2,total=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number1=inp.nextInt();
        System.out.print("kuvveti girniz: ");
        number2=inp.nextInt();

        for(int i=1;i<=number2;i++){
            total*=number1;
        }
        System.out.print(number1+" sayısının "+number2+" üssü : "+total);
    }
}
