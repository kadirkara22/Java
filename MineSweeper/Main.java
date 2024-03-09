package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int row,column;
        System.out.println("Mayin tarlasına hosgeldiniz.");
        System.out.println("Lutfen oynamak istediginiz boyutları giriniz");
        System.out.print("Satir sayisi: ");
         row=scan.nextInt();
        System.out.print("Sutun sayisi: ");
        column=scan.nextInt();
      MineSweeper mine=new MineSweeper(row,column);
      mine.play();

    }
}
