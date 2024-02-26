package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java döngüler ile fibonacci serisi bulan program yazıyoruz.
         Fibonacci serisinin eleman sayısını kullanıcıdan alın.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin kaçıncı elemanına kadar olacak? ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci serisi:");

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
