package semester_1.latihan_utp;

import java.util.Scanner;

public class CabutRumput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angkaDesimal = scanner.nextInt();
        String angkaBiner = Integer.toBinaryString(angkaDesimal);
        int count = 0;
        for(int i = 0; i < angkaBiner.length(); i++) {
            if(angkaBiner.charAt(i) == '1') count++;
        }
        if(count % 2 == 0) System.out.println("Cabut rumputnya");
        else System.out.println("Jangan cabut");
    }

}
