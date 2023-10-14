package semester_1.latihan_utp;

import java.util.Scanner;

public class SotoSateCL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaPemesan = scanner.nextLine();
        int angkaUnik = scanner.nextInt();
        int jumlahPorsi = scanner.nextInt();
        boolean isNasi = angkaUnik % 2 == 0;
        boolean isSoto = angkaUnik % 3 == 0;
        boolean isSate = angkaUnik % 5 == 0;

        if(!isNasi && !isSoto && !isSate) {
            System.out.println("Tidak Ada Pesanan");
        } else {
            int hargaNasi = 0, hargaSoto = 0, hargaSate = 0;
            if(isNasi) hargaNasi = 3000 * jumlahPorsi;
            if(isSoto) hargaSoto = 7000 * jumlahPorsi;
            if(isSate) hargaSate = 5000 * jumlahPorsi;
            int totalPesanan = hargaNasi + hargaSoto + hargaSate;

            System.out.println("PROGRAM KASIR SOTO SATE CL");
            System.out.println("Nama Pemesan : " + namaPemesan);
            System.out.print('\n');
            System.out.printf("|%-20s|%-15s|%20s|\n", "NAMA PESANAN", "JUMLAH", "HARGA");
            String tableFormatter = "|%-20s|%-15d|%20d|\n";
            if(isNasi) System.out.printf(tableFormatter, "Nasi", jumlahPorsi, hargaNasi);
            if(isSoto) System.out.printf(tableFormatter, "Soto", jumlahPorsi, hargaSoto);
            if(isSate) System.out.printf(tableFormatter, "Sate", jumlahPorsi, hargaSate);
            System.out.print('\n');
            System.out.println("Total Pesanan : Rp "+totalPesanan);
        }
    }

}
