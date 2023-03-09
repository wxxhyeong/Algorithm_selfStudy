package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj4375 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine()) != null) {
            int c = Integer.parseInt(s);
            int num = 1;
            int i = 1; // 자리 수

            while (true) {
                if (num % c == 0) {
                    sb.append(i + "\n");
                    break;
                }

                num = num * 10 + 1;
                num %= c;
                i++;
            };
        }

        System.out.println(sb.toString());
    }
}
