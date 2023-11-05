package HesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*hesap makinesini switch-case kullanarak yapınız.*/
        int number1,number2,select;

        Scanner inp= new Scanner(System.in);
        System.out.print("Birinci Sayıyı giriniz: ");
        number1=inp.nextInt();
        System.out.print("Ikinci Sayıyı giriniz: ");
        number2=inp.nextInt();
        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Mod Alma\n6-üst Alma");
        select=inp.nextInt();
        switch(select) {
            case 1:
                System.out.println("Toplam: "+(number1+number2));
                break;
            case 2:
                System.out.println("Çıkarma: "+(number1-number2));
                break;
            case 3:
                System.out.println("Çarpma: "+(number1*number2));
                break;
            case 4:
                if (number2!=0){
                    System.out.println("Bölme: "+(number1/number2));
                }else{
                    System.out.println("Bölme işleminde ikinci sayı sıfır olamaz");
                }

                break;
            case 5:
                System.out.println("Mod: "+(number1%number2));
                break;
            case 6:
                System.out.println(number1 + " in " + number2 + ". Kuvveti " + Math.pow(number1, number2));

                break;
            default:
                // code block
        }
    }
}
