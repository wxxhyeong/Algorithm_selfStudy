package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1850 {

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long a = Long.parseLong(stk.nextToken());
        long b = Long.parseLong(stk.nextToken());

        for (int i = 0; i < gcd(a, b); i++) {
            sb.append("1");
        }

        System.out.println(sb.toString());

    }
}
