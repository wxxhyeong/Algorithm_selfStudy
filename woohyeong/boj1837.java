package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1837 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer stk = new StringTokenizer(br.readLine());

        //String number = stk.nextToken();
        //int k = Integer.parseInt(stk.nextToken());

        String num = "273";
        int sum = 50;
        sum = sum + num.charAt(1) - '1';
        System.out.println(sum);




    }
}