package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11653 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[n + 1];

        if (n == 1) {
            //System.out.println("시스템을 종료합니다");
            System.exit(0);
        }

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        int start = 2;

        while (n != 1) {
            if (!isPrime[start]) {
                if (n % start == 0) {
                    n /= start;
                    sb.append(start + "\n");
                    continue;
                }
            }
            start++;
        }

        System.out.println(sb.toString());


    }
}
