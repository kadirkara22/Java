package Transpoz_alma;

public class Main {
    public static void main(String[] args) {
        /*
        Java dilinde, çok boyutlu diziler ile oluşturulmuş
         matrisin transpozunu bulan programı yazınız.
         */
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int satir = matris.length;
        int sutun = matris[0].length;

        // Transpoz matrisi oluştur
        int[][] transpoz = new int[sutun][satir];

        // Matrisin transpozunu hesapla
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Matrisi ekrana yazdır
        System.out.println("Orjinal Matris:");
        matrisiYazdir(matris);

        System.out.println("Transpoz Matris:");
        matrisiYazdir(transpoz);
    }

    // Matrisi ekrana yazdırmak için yardımcı bir metot
    static void matrisiYazdir(int[][] matris) {
        for (int[] row : matris) {
            for (int eleman : row) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
