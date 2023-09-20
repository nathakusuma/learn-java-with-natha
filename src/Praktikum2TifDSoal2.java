import java.util.Scanner;

public class Praktikum2TifDSoal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT
        System.out.print("Program penghitung pemakaian listrik sederhana\n");
        System.out.print("Masukkan Nama                       :");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Kelurahan                  :");
        String kelurahan = scanner.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter      :");
        int kwhAwal = scanner.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter     :");
        int kwhAkhir = scanner.nextInt();
        System.out.print("Masukkan biaya beban saat ini       :");
        int biayaBeban = scanner.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)         :");
        int ppj = scanner.nextInt();

        // PROCESS
        int pemakaian = kwhAkhir - kwhAwal;
        int tarifListrik = biayaBeban * pemakaian;
        int nominalPPJ = tarifListrik * ppj/100;
        int totalBayar = tarifListrik + nominalPPJ;

        // OUTPUT
        String headerFooter = "==================PLN Java==================";
        System.out.println(headerFooter);
        System.out.printf("Nama                    : %s\n", nama);
        System.out.printf("Kelurahan               : %s\n", kelurahan);
        System.out.printf("Pemakaian bulan ini     : %d Kwh Meter\n", pemakaian);
        System.out.printf("Tarif listrik           : Rp %d,-\n", tarifListrik);
        System.out.printf("PPJ %d%%                 : Rp %d,-\n", ppj, nominalPPJ);
        System.out.printf("Total Bayar             : Rp %d,-\n", totalBayar);
        System.out.println(headerFooter);
    }

}
