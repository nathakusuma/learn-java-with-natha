package semester_1.utp_dsi;

import java.util.Scanner;

public class TangkapBola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sudutElevasi = scanner.nextInt();
        double kecepatan = scanner.nextDouble() * 5 / 18;

        int jarak = (int) Math.ceil(50 * Math.tan(Math.toRadians(sudutElevasi)));
        boolean isTangkap = jarak <= kecepatan * 6;
        System.out.println("Jarak horizontal bola terhadap gedung: " + jarak + " meter");
        System.out.println("Peserta dapat menangkap bola: " + isTangkap);
    }

}
