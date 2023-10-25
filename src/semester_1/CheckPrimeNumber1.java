// https://www.hackerrank.com/contests/livecode-3-tif-a/challenges/check-prime-number-1

package semester_1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPrimeNumber1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean[] isPrime = new boolean[x+1];
        Arrays.fill(isPrime, true);
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if(isPrime[x]) break;
            if(isPrime[i]) {
                for (int j = i*i; j <= x; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
        String output = isPrime[x] ? "Prima" : "Bukan Prima";
        System.out.println(output);
    }

}
