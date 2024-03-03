package EBOB_EKOK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.*/

        int number1,number2,minNumber,ekok;
        int i=1;
        int ebob=1;
        Scanner imp=new Scanner(System.in);
        System.out.print("1.sayiyi giriniz :");
        number1=imp.nextInt();
        System.out.print("2.sayiyi giriniz :");
        number2=imp.nextInt();

        minNumber=(number1<number2) ? number1 :number2;
        /*System.out.println(minNumber);*/
        while(i<=minNumber){
            if(number1%i==0 && number2%i==0) {
                ebob=i;

            }
            i++;
        }
        ekok = (number1 * number2)/ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
