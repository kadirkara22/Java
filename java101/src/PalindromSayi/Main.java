package PalindromSayi;

import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number){
int temp=number,reverseNumber=0,lastNumber;
while(temp!=0){
lastNumber=temp%10;
reverseNumber=(reverseNumber*10)+lastNumber;
temp/=10;
}

if(number==reverseNumber){
    System.out.println(number+" Palindrom sayıdır");
    return  true;
}else{
    System.out.println(number+" Palindrom sayı degildir.");
    return false;
}
    }

    public static void main(String[] args) {
        /*Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.*/
        Scanner inp=new Scanner(System.in);
        System.out.print("lütfen bir sayi giriniz: ");
        int number=inp.nextInt();
        System.out.println((isPalindrom(number)));

    }
}
