package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());

        int[] numList = new int[n];
        for (int i = 0; i < n; i++) {
            numList[i] = Integer.parseInt(stk.nextToken());
        }

        int start = 0;
        int end = 0;

        //long sum = numList[];



    }
}
