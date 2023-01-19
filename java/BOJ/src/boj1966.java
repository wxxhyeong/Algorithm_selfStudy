import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer stk;

        for (int z = 0; z < t; z++) {
            stk = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(stk.nextToken());
            int m = Integer.parseInt(stk.nextToken());

            Deque<Integer> queue = new ArrayDeque<>();
            stk = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                queue.offer(Integer.parseInt(stk.nextToken()));
            }

            while (!queue.isEmpty()) {
                int temp = queue.po
            }

        }
    }
}
