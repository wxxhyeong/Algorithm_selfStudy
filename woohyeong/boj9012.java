package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String ps = br.readLine();
            int cnt = 0;

            for (int j = 0; j < ps.length(); j++) {
                if (cnt >= 0) {
                    if (ps.charAt(j)=='(') {
                        cnt++;
                    }
                    else
                        cnt --;
                }
                else
                    break;
            }

            if (cnt == 0) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
