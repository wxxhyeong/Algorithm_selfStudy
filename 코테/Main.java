import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited;
    static int result = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            result = 0;
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> numbers = new ArrayList<>(n);
            LinkedList<Integer> output = new LinkedList<>();
            visited = new boolean[n];

            StringTokenizer stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                numbers.add(Integer.parseInt(stk.nextToken()));
            }
            permutation(numbers, output, 1, n, n);
            System.out.printf("#%d %d\n",i+1, result);
        }


    }

    public static void permutation(ArrayList<Integer> numbers, LinkedList<Integer> output, int depth, int n, int r){
        if (depth == r) {
            int ans = countResult(output, n);
            if (result < ans) {
                result = ans;
            }
            return;
        }

        for (int i = 1; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output.add(numbers.get(i));
                permutation(numbers, output, depth + 1, n, r);
                visited[i] = false;
                output.remove(output.size()-1);
            }
        }
    }

    public static int countResult(LinkedList<Integer> output, int n) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            double sum = Math.sqrt(output.get(i) + output.get((i+1)%n));
            if (sum == (int)sum) {
                ans += 1;
            }
        }
        return ans;
    }
}