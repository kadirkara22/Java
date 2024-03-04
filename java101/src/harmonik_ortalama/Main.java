package harmonik_ortalama;

public class Main {
    public static void main(String[] args) {
        /*
          Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
          Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
        */

        int[] numbers = {5, 8, 12, 3, 6};

        double harmonikOrtalama = calculateHarmonicAverage(numbers);

        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }

    // Harmonik Ortalama Hesaplayan Fonksiyon
    public static double calculateHarmonicAverage(int[] arr) {
        int n = arr.length;
        double harmonicSum = 0;

        for (int num : arr) {
            harmonicSum += 1.0 / num;
        }

        return n / harmonicSum;
    }


}
