package semester_1.latihan_utp;

import java.util.Scanner;

public class WamBoomPow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n % 3 == 0) {
            System.out.print("Wam");
        }
        if (n % 5 == 0) {
            System.out.print("Boom");
        }
        if (n % 7 == 0) {
            System.out.print("Pow");
        }
    }

}
