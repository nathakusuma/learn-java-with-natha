package semester_1.lc_si_c;

import java.util.Scanner;

public class ItungItunganRumit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        int req = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                int temp = scanner.nextInt();
                arr[i][j] = temp;
                if(temp > max) max = temp;
            }
        }
        for(int i1 = 0; i1 < a; i1++) {
            for(int j1 = 0; j1 < b; j1++) {
                /*
                OPTIMISASI
                Jika arr[i1][j1] ditambah nilai terbesar dari matriks lebih kecil dari angka yang diminta,
                maka sudah dipastikan tidak ada nilai lain pada matriks yang dapat memenuhi persyaratan.
                Maka skip cari i2 dan j2.
                 */
                if(arr[i1][j1] + max < req) continue;
                for(int i2 = 0; i2 < a; i2++) {
                    for(int j2 = 0; j2 < b; j2++) {
                        if(arr[i1][j1] + arr[i2][j2] == req) {
                            System.out.printf("Indeks pertama adalah %d di %d, %d\n", arr[i1][j1], i1, j1);
                            System.out.printf("Indeks kedua adalah %d di %d, %d\n", arr[i2][j2], i2, j2);
                            return;
                        }
                    }
                }
            }
        }
    }

}
