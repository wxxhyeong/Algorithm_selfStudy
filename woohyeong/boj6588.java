package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boj6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean isFind;
        int n;
        int N = 1000000;

        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i*i <= N; i++) { // i*i 를 하는 이유,
            if (!isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        while (true) {
            isFind = false;
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            for (int i = 3; i < n; i++) {
                if (!isPrime[i]) {
                    if (!isPrime[n - i]) {
                        sb.append(n + " = " + i + " + " + (n - i) + "\n");
                        isFind = true;
                        break;
                    }
                }
            }
            if (!isFind) {
                sb.append("Goldbach's conjecture is wrong.");
            }
        }

        System.out.println(sb.toString());
    }
}
