package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());
        double maxNum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(stk.nextToken());
            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum +=numbers[i]/maxNum * 100;
        }
        System.out.println(sum/ n);

    }
}
