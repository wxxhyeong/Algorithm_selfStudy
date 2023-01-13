import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 백준 18258. 큐2
/*
일일히 하나씩 출력하는 것은 속도가 오래 걸려서 시간 초과 에러가 난다.
StringBuilder로 결과들을 저장해서 한번에 출력하도록 하자
Deque를 사용하였다. deque의 사용법을 익히고, 선언할 때 ArrayDeque를 사용할 지, LinkedList를 사용할 지
어떤 것을 사용하는 것이 적합한 방법인지 알아보도록 하자.
 */
public class boj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            stk = new StringTokenizer(br.readLine(), " ");
            switch (stk.nextToken()) {
                case "push":
                    q.add(Integer.parseInt(stk.nextToken()));
                    break;

                case "pop":
                    if (q.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(q.pop() + "\n");
                    }
                    break;
                case "empty":
                    if (q.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "size":
                    sb.append(q.size() + "\n");
                    break;
                case "front":
                    if (q.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(q.getFirst()+"\n");
                    }
                    break;
                case "back":
                    if (q.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(q.getLast()+"\n");
                    }
            }
        }
        System.out.println(sb);
    }
}
