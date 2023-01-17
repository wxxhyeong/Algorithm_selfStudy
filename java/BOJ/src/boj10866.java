import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk;
        Deque<Integer> deque = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine());

            switch (stk.nextToken()) {
                case "push_back":
                    deque.addLast(Integer.parseInt(stk.nextToken()));
                    break;
                case "push_front":
                    deque.addFirst(Integer.parseInt(stk.nextToken()));
                    break;
                case "pop_front":
                    if (deque.size() == 0) {
                        sb.append("-1\n");
                    }
                    else {
                        sb.append(deque.pollFirst() + "\n");
                    }
                    break;
                case "pop_back":
                    if (deque.size() == 0) {
                        sb.append("-1\n");
                    }
                     else{
                         sb.append(deque.pollLast() + "\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.size() != 0) {
                        sb.append("0\n");
                    } else {
                        sb.append("1\n");
                    }
                    break;
                case "front":
                    if (deque.size() == 0) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.getFirst()+"\n");
                    }
                    break;
                case "back":
                    if (deque.size() == 0) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.getLast() + "\n");
                    }
            }
        }
        System.out.println(sb);
    }
}
