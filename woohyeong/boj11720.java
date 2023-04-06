package woohyeong;
import java.io.*;

public class boj11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] numbers = br.readLine().toCharArray();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += numbers[i] - '0';
        }

        System.out.println(sum);
    }
}
