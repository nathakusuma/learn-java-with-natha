// Live coding TIF D Soal 2
// Tidak boleh menggunakan percabangan dan perulangan

import java.util.Scanner;

public class KatsuGKM {

    public static void main(String[] args) {
        // INPUT
        Scanner scanner = new Scanner(System.in);
        String pemesan = scanner.nextLine();
        int jamPesan = scanner.nextInt();
        int menitPesan = scanner.nextInt();
        String namaMakanan1 = scanner.next();
        int hargaMakanan1 = scanner.nextInt();
        int kuantitasMakanan1 = scanner.nextInt();
        String namaMakanan2 = scanner.next();
        int hargaMakanan2 = scanner.nextInt();
        int kuantitasMakanan2 = scanner.nextInt();
        String namaMakanan3 = scanner.next();
        int hargaMakanan3 = scanner.nextInt();
        int kuantitasMakanan3 = scanner.nextInt();
        String namaMakanan4 = scanner.next();
        int hargaMakanan4 = scanner.nextInt();
        int kuantitasMakanan4 = scanner.nextInt();
        int durasiPembuatanMenit = scanner.nextInt();

        // PROCESS
        int totalDurasiJam = jamPesan + (menitPesan + durasiPembuatanMenit) / 60;
        int totalDurasiMenit = (menitPesan + durasiPembuatanMenit) % 60;
        int totalHarga = hargaMakanan1 * kuantitasMakanan1 + hargaMakanan2 * kuantitasMakanan2 + hargaMakanan3 * kuantitasMakanan3 + hargaMakanan4 * kuantitasMakanan4;
        double konversiYen = totalHarga / 103.0;

        // OUTPUT
        String tableFormatter = "%-3s| %-25s | %-15d | %-15d |\n";
        System.out.println("=".repeat(68)); // BELUM DIAJARI .repeat()
        System.out.printf("%68s\n", "KATSU GKM FILKOM UB");
        System.out.printf("%68s\n", "PEMESAN : "+pemesan);
        System.out.printf("%68s\n", "Jam : "+jamPesan+" Menit : "+menitPesan);
        System.out.print('\n');
        System.out.printf("%-3s| %-25s | %-15s | %-15s |\n", "No.", "Nama Makanan", "Kuantitas", "Harga");
        System.out.printf(tableFormatter, "1.", namaMakanan1, kuantitasMakanan1, hargaMakanan1);
        System.out.printf(tableFormatter, "2.", namaMakanan2, kuantitasMakanan2, hargaMakanan2);
        System.out.printf(tableFormatter, "3.", namaMakanan3, kuantitasMakanan3, hargaMakanan3);
        System.out.printf(tableFormatter, "4.", namaMakanan4, kuantitasMakanan4, hargaMakanan4);
        System.out.printf("%49s| Rp. %d\n", "Total Harga", totalHarga);
        System.out.printf("%49s| %.2f Yen\n", "Konversi Yen", konversiYen);
        System.out.print('\n');
        System.out.printf("%68s\n", "Jam : "+totalDurasiJam+" Menit : "+totalDurasiMenit);
        System.out.println("=".repeat(68));
    }

}
