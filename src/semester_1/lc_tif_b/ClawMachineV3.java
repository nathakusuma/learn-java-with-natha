package semester_1.lc_tif_b;

import java.util.Scanner;

public class ClawMachineV3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaPemain = scanner.nextLine();
        int saldo = scanner.nextInt();
        int hargaTiket = scanner.nextInt();
        String outputLineBreak = "------------------------------";
        System.out.println("Halo " + namaPemain);
        System.out.println("Saldo awal = Rp. " + saldo);
        System.out.println("Harga tiket = Rp. " + hargaTiket);
        System.out.println(outputLineBreak);
        scanner.nextLine();
        String hadiah1 = scanner.nextLine();
        String hadiah2 = scanner.nextLine();
        String hadiah3 = scanner.nextLine();
        String hadiah4 = scanner.nextLine();
        while (true) {
            String fungsi = scanner.next().toLowerCase();
            if (fungsi.equals("selesai")) {
                System.out.println("Permainan selesai");
                break;
            }
            if(saldo - hargaTiket < 0) {
                System.out.println("Maaf saldo tidak cukup");
                System.out.println("Permainan selesai");
                break;
            }
            int nomorHadiah = scanner.nextInt();
            String namaHadiah = "Anda mendapatkan ";
            switch (nomorHadiah) {
                case 1 -> namaHadiah += hadiah1;
                case 2 -> namaHadiah += hadiah2;
                case 3 -> namaHadiah += hadiah3;
                case 4 -> namaHadiah += hadiah4;
                default -> namaHadiah = "Anda belum beruntung";
            }
            System.out.println(namaHadiah);
            saldo -= hargaTiket;
            System.out.println("Sisa saldo = Rp. "+saldo);
            System.out.println(outputLineBreak);
        }
    }
}
