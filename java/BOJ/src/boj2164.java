import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;

public class boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        Queue<Integer> numList = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            numList.offer(i);
        }

        while (numList.size() != 1) {
            numList.poll();
            numList.offer(numList.poll());
        }
        System.out.println(numList.poll());
    }
}
