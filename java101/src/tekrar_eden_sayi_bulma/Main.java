package tekrar_eden_sayi_bulma;

import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr,int value){
        for(int i:arr){
           if(i==value){
               return true;
           }
        }

    return  false;
    }

    public static void main(String[] args) {
        /*Bir sayı dizisindeki tekrar eden çift sayıları belirten bir programı yaz*/

 int[] list={3,7,3,3,2,9,10,21,1,33,9,1};
 int[] dizi=new int[list.length];
 int startIndex=0;

        for (int i=0;i<list.length;i++){
            for(int j=0;j<list.length;j++){
                if((i!=j)&&(list[i]==list[j])){
                    if(!isFind(dizi,list[i])){
                        dizi[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }

        for(int value:dizi){
                if(value!=0){
                    System.out.print(value+", ");
                }
        }

    }
}
