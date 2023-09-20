// MULAI JAM 19:10

import java.util.Scanner;

public class Praktikum2TifDSoal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan operator pertama: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan operator kedua: ");
        int b = scanner.nextInt();
        int jumlah = a + b;
        int kurang = a - b;
        int kali = a * b;
        double bagi = (double) a / b;
        System.out.printf("Hasil penjumlahan     : %d\n", jumlah);
        System.out.printf("Hasil pengurangan     : %d\n", kurang);
        System.out.printf("Hasil perkalian       : %d\n", kali);
        System.out.printf("Hasil pembagian       : %.1f\n", bagi);

        scanner.close();
    }
}
