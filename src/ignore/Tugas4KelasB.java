package ignore;

import java.util.HashMap;
import java.util.Scanner;

public class Tugas4KelasB {

    public static void main(String[] args) {
        // INPUT
        String bintangBintang = "*******************";
        System.out.println(bintangBintang);
        System.out.println("Toko Mart");
        System.out.println("[23515020111023] [I Putu Natha Kusuma]");
        System.out.println(bintangBintang);
        String formatter = "%s harga : %d\n";
        System.out.printf(formatter, "sabun", 1000);
        System.out.printf(formatter, "sampo", 2000);
        System.out.printf(formatter, "sapu", 1500);
        System.out.printf(formatter, "gula", 2500);

        // PROCESS
        HashMap<String, Integer> listHarga = new HashMap<>();
        listHarga.put("sabun", 1000);
        listHarga.put("sampo", 2000);
        listHarga.put("sapu", 1500);
        listHarga.put("gula", 2500);
        HashMap<String, Integer> totalBarang = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan nama barang ('selesai' untuk keluar): ");
            String namaBarang = scanner.next();
            if(namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }
            if(!listHarga.containsKey(namaBarang)) {
                System.out.println("Barang tidak ditemukan");
                continue;
            }
            int jumlah = scanner.nextInt();
            totalBarang.put(namaBarang, totalBarang.getOrDefault(namaBarang, 0)+jumlah);
        }
        int totalHarga = 0;
        System.out.println("Daftar belanja");
        String outputHeaderFooter = "---------------------------------------------";
        System.out.println(outputHeaderFooter);
        String outputTableFormatter = "| %-19s | %-19s |\n";
        System.out.printf(outputTableFormatter, "Nama", "Total Harga");
        for(String s : totalBarang.keySet()) {
            int totalHargaBarang = listHarga.get(s) * totalBarang.get(s);
            totalHarga += totalHargaBarang;
            System.out.printf(outputTableFormatter, s, totalHargaBarang);
        }
        if(totalHarga > 10000) {
            totalHarga -= (int) (totalHarga * 0.25);
        }
        System.out.println(outputHeaderFooter);

        System.out.println("Total yang harus dibayar : "+totalHarga);
    }

}
