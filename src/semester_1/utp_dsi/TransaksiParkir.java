package semester_1.utp_dsi;

import java.util.Scanner;

public class TransaksiParkir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        int uang = scanner.nextInt();

        int hargaParkirKendaraan = switch (jenisKendaraan) {
            case 1 -> 2000;
            case 2 -> 4000;
            case 3 -> 9000;
            default -> 0;
        };
        int sisaUang = uang - (hargaParkirKendaraan * lamaParkir);
        if(sisaUang == 0) {
            System.out.println("Uang yang dibayarkan pas.");
        } else if (sisaUang < 0) {
            System.out.println("Uang anda belum mencukupi.");
        } else {
            int count10000 = 0, count5000 = 0, count500 = 0, count100 = 0;
            int nominal = 10000;
            if(sisaUang >= nominal) {
                count10000 = sisaUang / nominal;
                sisaUang %= nominal;
            }
            nominal = 5000;
            if(sisaUang >= nominal) {
                count5000 = sisaUang / nominal;
                sisaUang %= nominal;
            }
            nominal = 500;
            if(sisaUang >= nominal) {
                count500 = sisaUang / nominal;
                sisaUang %= nominal;
            }
            nominal = 100;
            if(sisaUang >= nominal) {
                count100 = sisaUang / nominal;
            }

            System.out.println("Anda mendapatkan kembalian sebesar:");
            String outputFormatter = "%d uang %s\n";
            System.out.printf(outputFormatter, count10000, "10.000");
            System.out.printf(outputFormatter, count5000, "5.000");
            System.out.printf(outputFormatter, count500, "500");
            System.out.printf(outputFormatter, count100, "100");
        }
    }

}
