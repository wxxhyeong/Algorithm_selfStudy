import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class boj1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String text = br.readLine();
        Deque<Double> queue = new LinkedList<>();

        Double[] arr = new Double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (65 <= c && c <= 90) {
                queue.offer(arr[(int)c - 65]);
            }
            else {
                Double y = queue.pollLast();
                Double x = queue.pollLast();

                switch (c) {
                    case '+':
                        queue.offer(x + y);
                        break;
                    case '-':
                        queue.offer(x - y);
                        break;
                    case '*':
                        queue.offer(x * y);
                        break;
                    case '/':
                        queue.offer(x / y);
                }
            }
        }
        System.out.printf("%.2f", queue.pop());

    }
}
