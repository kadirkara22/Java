package AtmProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 30000;
        int select;
        while(right!=0){
            System.out.print("Adınız: ");
             userName=input.nextLine();
            System.out.print("password: ");
            password=input.nextLine();
            if(userName.equals("javapatika") && password.equals("java123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch(select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int cekilenprice = input.nextInt();
                            if (cekilenprice > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= cekilenprice;
                                System.out.println("Bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            // code block
                            break;
                        default:
                            // code block
                    }

                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }else{
                right--;
                System.out.print("Hatalı kullanıcı girişi veya password hatası yaptınız.");
                if(right==0){
                   System.out.println(" Hesabınız Bloke olmuştur. Lütfen Bankanızla iletişime geçiniz");
                }else {
                    System.out.println(" Tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız: "+right);
                }
            }
        }

    }
}
