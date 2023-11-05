package KullaniciGiris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
          unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
           şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
           sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.*/

        String userName="javapatika",password="java123",inputUserName,inputPassword,newPassword;
        int secim;

        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
           inputUserName=inp.nextLine();
        System.out.print("Password: ");
        inputPassword=inp.nextLine();
        if((userName.equals(inputUserName)) && (password.equals(inputPassword))){
            System.out.println("Giriş Basarili");
        }else{
            System.out.println("Giriş Başarısız");
            System.out.println("Şifrenizi Sıfırlamak ister misiniz? Evet ise 1' e, Hayır ise 2' ye basınız.");
            secim= inp.nextInt();
            inp.nextLine();
            if(secim==1){
                System.out.print("Yeni Şifrenizi giriniz: ");
                newPassword= inp.nextLine();
                if(!password.equals(newPassword)){
                    System.out.print("Yeni Şifreniz oluşturuldu: "+newPassword);

                }else {
                    System.out.print("Yeni Şifreniz daha önceki şifrelerden farklı olmalıdır.");
                    System.out.println("Lüfen Başka Bir şifre giriniz");
                    newPassword= inp.nextLine();
                    if(!password.equals(newPassword)){
                        System.out.print("Yeni Şifreniz oluşturuldu: "+newPassword);
                    }
                }

            }else{
                System.out.print("Şifrenizi Sıfırlamak istemediniz");
            }
        }

    }
}
