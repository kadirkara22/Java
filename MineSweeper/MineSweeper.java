package MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rows;
    int columns;
    int totalMines;
    int[][] map;
    int[][]  board;
    boolean game=true;

Random random=new Random();
Scanner scan=new Scanner(System.in);

    public MineSweeper(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.totalMines = rows * columns / 4;
        this.map = new int[rows][columns];
        this.board=new int[rows][columns];
    }

    /*

     void placeMines() {
        Random random = new Random();
        int minesPlaced = 0;

        while (minesPlaced < totalMines) {
            int row = random.nextInt(rows);
            int col = random.nextInt(columns);

            if (mineField[row][col] != '*') {
                mineField[row][col] = '*';
                minesPlaced++;
                System.out.println(mineField[row][col]);
            }
            minesPlaced++;
            System.out.println(row);
            System.out.println(col);
        }

    }*/
         public   void  play(){
             int row,col,success=0;
             prepareGame();
              print(map);
             System.out.println("Oyun başladı !");
             while(game){
                 print(board);
                 System.out.print("Satir: ");
                 row=scan.nextInt();
                 System.out.print("Sutun: ");
                 col=scan.nextInt();
                 if(row<0 || row>=rows){
                     System.out.println("Gecersiz Koordinant");
                     continue;
                 }
                 if(col<0 || col>=columns){
                     System.out.println("Gecersiz Koordinant");
                     continue;
                 }
                 System.out.println("Seciniz");
                 System.out.println("1.Bomba yeri belirle");
                 System.out.println("2.Armaya devam");
                 System.out.print("Secim: ");
                 int secim = scan.nextInt();
                 if(secim==1){

                     if (board[row][col]!=-9) {
                         board[row][col]=-9;
                         success++;
                      if(success==totalMines){
                          print(board);
                          System.out.println("Tebrikler... ! Oyunu Kazandiniz.");
                          break;
                      }else{
                          System.out.println("Bomba yeri belirlendi!");
                      }



                     } else {
                         System.out.println("Bomba yeri zaten belirlendi. Lütfen başka bir seçenek seçin.");
                     }
                 }
                 if(secim==2){
                     if(map[row][col]!=-1){
                         checkMine(row,col);
                     }else{
                         game=false;
                         System.out.println("Game over");
                     }
                 }



             }
               }

               public void checkMine(int r,int c){
             if(map[r][c]==0){
                 if((c<columns-1) && (map[r][c+1]==-1)){
                     board[r][c]++;
                 }
                 if((r<columns-1) && (map[r+1][c]==-1)){
                     board[r][c]++;
                 }
                 if((r>0) && (map[r-1][c]==-1)){
                     board[r][c]++;
                 }
                 if((c>0) && (map[r][c-1]==-1)){
                     board[r][c]++;
                 }
                 if((c<columns-1 && r>0) && (map[r-1][c+1]==-1)){
                     board[r][c]++;
                 }
                 if((c<columns-1 && r<columns-1) && (map[r+1][c+1]==-1)){
                     board[r][c]++;
                 }
                 if((r>0 && c>0) && (map[r-1][c-1]==-1)){
                     board[r][c]++;
                 }
                 if((c>0 && r<columns-1) && (map[r+1][c-1]==-1)){
                     board[r][c]++;
                 }
                 if(board[r][c]==0){
                     board[r][c]=-2;
                 }

             }

               }

            public void prepareGame(){
                int row,col,count=0;
           while(count!=totalMines){
               row = random.nextInt(rows);
               col = random.nextInt(columns);

               if(map[row][col]!=-1){
                   map[row][col]=-1;
                   count++;
               }

           }

            }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>=0){
                    System.out.print(" ");
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
