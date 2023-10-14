package semester_1.latihan_utp;

import java.util.Scanner;

public class GuntingBatuKertas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama1 = scanner.next();
        String pilihan1 = scanner.next().toLowerCase();
        String nama2 = scanner.next();
        String pilihan2 = scanner.next().toLowerCase();
        if(pilihan1.equals(pilihan2)) {
            System.out.println(nama1 + " dan " + nama2 + " seri");
        } else {
            String namaPemenang = "";
            switch (pilihan1) {
                case "gunting" -> {
                    if (pilihan2.equals("batu")) {
                        namaPemenang = nama2;
                    } else if (pilihan2.equals("kertas")) {
                        namaPemenang = nama1;
                    }
                }
                case "batu" -> {
                    if (pilihan2.equals("gunting")) {
                        namaPemenang = nama1;
                    } else if (pilihan2.equals("kertas")) {
                        namaPemenang = nama2;
                    }
                }
                case "kertas" -> {
                    if (pilihan2.equals("gunting")) {
                        namaPemenang = nama2;
                    } else if (pilihan2.equals("batu")) {
                        namaPemenang = nama1;
                    }
                }
            }
            System.out.println(namaPemenang + " menang");
        }
    }

}
