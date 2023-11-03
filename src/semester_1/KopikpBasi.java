package semester_1;// Soal 2020

import java.util.Scanner;

public class KopikpBasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s|/");
        String nama = scanner.next();
        int n = scanner.nextInt();
        int toleransi = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            int tanggal = scanner.nextInt();
            int bulan = scanner.nextInt();
            if(bulan <= 11 && tanggal < 24) {
                count++;
            }
        }
        String output = "Perut "+nama+" ";
        if(count > toleransi) output += "sakit";
        else output += "baik-baik saja";
        System.out.println(output);
    }

}
