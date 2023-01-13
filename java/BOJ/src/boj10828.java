import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer stk;

        int[] stack = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine(), " ");
            String order = stk.nextToken();
            switch (order) {

                case "push":
                    stack[size] = Integer.parseInt(stk.nextToken());
                    size++;
                    break;

                case "pop":
                    if (size == 0) {
                        System.out.println(-1);
                        continue;
                    }
                    size--;
                    System.out.println(stack[size]);
                    break;

                case "size":
                    System.out.println(size);
                    break;

                case "empty":
                    if (size == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if (size == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[size-1]);
                    }
            }
        }
    }
}
