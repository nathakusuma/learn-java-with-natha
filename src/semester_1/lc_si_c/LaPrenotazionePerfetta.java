package semester_1.lc_si_c;

import java.util.Scanner;

public class LaPrenotazionePerfetta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"Tono", "Jojo", "Karimun", "Gon", "Obama", "Joko", "Susi", "Budi", "Rina", "Ahmad", "Siti", "Eko", "Putri", "Dian", "Rizal", "Maya", "Andi", "Nia", "Rizky", "Fika"};
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            int j = scanner.nextInt();
            System.out.print(arr[j]);
            if(i != n-1) System.out.print(", ");
        }
    }

}
