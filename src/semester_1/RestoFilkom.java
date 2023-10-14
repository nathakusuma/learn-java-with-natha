package semester_1;// TUGAS TI B

import java.util.Scanner;

public class RestoFilkom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0;
        while (true) {
            int nomorMenu = scanner.nextInt();
            int harga = 0;
            switch (nomorMenu){
                case 1:
                    harga = 20000;
                    break;
                case 2:
                    harga = 15000;
                    break;
                case 3:
                    harga = 18000;
                    break;
                case 4:
                    harga = 17000;
                    break;
                case 5:
                    harga = 25000;
                    break;
                default:
                    System.out.println("Menu nomer " + nomorMenu + " tidak ada");
                    break;
            }
            totalHarga += harga;
            scanner.nextLine();
            String pesanLagi = scanner.nextLine();
            if(pesanLagi.equalsIgnoreCase("tidak")) {
                break;
            }
        }
        totalHarga += (int) (totalHarga * 0.1);
        System.out.println("Total harga makanan anda adalah Rp "+totalHarga+",-");
    }

}
