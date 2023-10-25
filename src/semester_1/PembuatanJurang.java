package semester_1;

import java.util.Scanner;

public class PembuatanJurang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int spasi = 2*(n-1);
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print('*');
            }
            for(int j = 0; j < spasi; j++) {
                System.out.print(' ');
            }
            spasi -= 2;
            for(int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

}
