// https://www.hackerrank.com/contests/livecode-3-tif-a/challenges/check-prime-number-1

package semester_1;

import java.util.Scanner;

public class CheckPrimeNumber1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean[] isNotPrime = new boolean[x+1];
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if(!isNotPrime[i]) {
                for (int j = i*i; j <= x; j+=i) {
                    isNotPrime[j] = true;
                }
            }
        }
        String output = isNotPrime[x] ? "Bukan Prima" : "Prima";
        System.out.println(output);
    }

}
