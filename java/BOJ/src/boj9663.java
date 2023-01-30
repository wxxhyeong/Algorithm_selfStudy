/*
백준 9663. N-Queen
 */

import java.util.Scanner;

public class boj9663 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[][] chess = new boolean[n][n];
        boolean[] col = new boolean[n];
        boolean[] low = new boolean[n];
        boolean[] crossRight = new boolean[n];
        boolean[] crossLeft = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (col[i]) {
                for (int j = 0; i < n; i++) {
                    if (low[j]) {
                        if (crossRight[])
                    }

                }

            }

        }
    }
}
