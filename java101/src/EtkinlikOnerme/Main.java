package EtkinlikOnerme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/

    int heat;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık giriniz: ");
        heat=inp.nextInt();

        if(heat<5){
            System.out.print("Kayak yapmaya gidebilirsiniz");
        }else if(heat<=25){
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if(heat>=10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else {
            System.out.print("Yüzmeye gidebilirsiniz");
        }


    }
}
