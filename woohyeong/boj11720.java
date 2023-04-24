package woohyeong;
import java.io.*;
import java.util.StringTokenizer;

public class boj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int max = 0;
        int sum = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            sum += i;
        }

        System.out.println(sum*100.0/max/n);


    }
}
