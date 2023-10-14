package semester_1.latihan_utp;

import java.util.Scanner;

public class KelipatanAtauBukan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if(n == 0) {
            System.out.println(n);
        } else if (n % k == 0) {
            System.out.println("BENAR");
        } else {
            System.out.println("SALAH");
        }
    }

}
