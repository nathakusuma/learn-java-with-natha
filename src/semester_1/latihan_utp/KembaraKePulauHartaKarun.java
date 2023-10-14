package semester_1.latihan_utp;

import java.util.Scanner;

public class KembaraKePulauHartaKarun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print("Kapten Jarjit Singh harus berjalan ke arah ");
        if(input.length() >= 3) {
            String inputSubs = input.substring(0, 3);
            input = input.substring(3);
            String arahSingkatan = inputSubs.substring(0, 1);
            String arahKepanjangan = "";
            int langkah = Integer.parseInt(inputSubs.substring(1, 3));
            if(arahSingkatan.equalsIgnoreCase("u")) arahKepanjangan = "Utara";
            else if(arahSingkatan.equalsIgnoreCase("b")) arahKepanjangan = "Barat";
            else if(arahSingkatan.equalsIgnoreCase("s")) arahKepanjangan = "Selatan";
            else if(arahSingkatan.equalsIgnoreCase("t")) arahKepanjangan = "Timur";
            String dan = input.length() == 3 ? ", dan " : input.isEmpty() ? "." : ", ";
            System.out.print(arahKepanjangan + " sebanyak " + langkah + " langkah" + dan);
        }
        if(input.length() >= 3) {
            String inputSubs = input.substring(0, 3);
            input = input.substring(3);
            String arahSingkatan = inputSubs.substring(0, 1);
            String arahKepanjangan = "";
            int langkah = Integer.parseInt(inputSubs.substring(1, 3));
            if(arahSingkatan.equalsIgnoreCase("u")) arahKepanjangan = "Utara";
            else if(arahSingkatan.equalsIgnoreCase("b")) arahKepanjangan = "Barat";
            else if(arahSingkatan.equalsIgnoreCase("s")) arahKepanjangan = "Selatan";
            else if(arahSingkatan.equalsIgnoreCase("t")) arahKepanjangan = "Timur";
            String dan = input.length() == 3 ? ", dan " : input.isEmpty() ? "." : ", ";
            System.out.print(arahKepanjangan + " sebanyak " + langkah + " langkah" + dan);
        }
        if(input.length() >= 3) {
            String inputSubs = input.substring(0, 3);
            input = input.substring(3);
            String arahSingkatan = inputSubs.substring(0, 1);
            String arahKepanjangan = "";
            int langkah = Integer.parseInt(inputSubs.substring(1, 3));
            if(arahSingkatan.equalsIgnoreCase("u")) arahKepanjangan = "Utara";
            else if(arahSingkatan.equalsIgnoreCase("b")) arahKepanjangan = "Barat";
            else if(arahSingkatan.equalsIgnoreCase("s")) arahKepanjangan = "Selatan";
            else if(arahSingkatan.equalsIgnoreCase("t")) arahKepanjangan = "Timur";
            String dan = input.length() == 3 ? ", dan " : input.isEmpty() ? "." : ", ";
            System.out.print(arahKepanjangan + " sebanyak " + langkah + " langkah" + dan);
        }
        if(input.length() >= 3) {
            String inputSubs = input.substring(0, 3);
            input = input.substring(3);
            String arahSingkatan = inputSubs.substring(0, 1);
            String arahKepanjangan = "";
            int langkah = Integer.parseInt(inputSubs.substring(1, 3));
            if(arahSingkatan.equalsIgnoreCase("u")) arahKepanjangan = "Utara";
            else if(arahSingkatan.equalsIgnoreCase("b")) arahKepanjangan = "Barat";
            else if(arahSingkatan.equalsIgnoreCase("s")) arahKepanjangan = "Selatan";
            else if(arahSingkatan.equalsIgnoreCase("t")) arahKepanjangan = "Timur";
            String dan = input.length() == 3 ? ", dan " : input.isEmpty() ? "." : ", ";
            System.out.print(arahKepanjangan + " sebanyak " + langkah + " langkah" + dan);
        }
    }

}
