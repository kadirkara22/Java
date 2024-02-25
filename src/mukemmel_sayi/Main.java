package mukemmel_sayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve
         sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
        ifadelerini ekrana yazan programı Java dilinde yazınız.*/
        int toplam=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int number=inp.nextInt();

        for (int i=1;i<=number;i++){
            if(number%i==0){
                toplam=+i;
            }


        }

        if(toplam==number){
            System.out.println(number+" mükemmel sayidir.");
        }else{
            System.out.println(number+" mükemmel sayi değildir.");
        }
    }
}
