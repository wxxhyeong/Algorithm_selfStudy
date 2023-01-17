/*
까먹었는데, 지금 코드 같은 경우에는 일일이 매반복마다 print를 해주었는데
출력하는 곳에서 시간이 꽤나 소요되는 경우가 많다.
출력을 모아서 해야 하는 경우 StringBuilder를 생성해서 결과를 저장한 후에 한번에 출력해주도록 하자.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int k = Integer.parseInt(stk.nextToken());

        Queue<Integer> numList = new LinkedList<>();

        // 1부터 n까지 숫자 큐 생성
        for (int i = 1; i <= n; i++) {
            numList.offer(i);
        }

        System.out.print("<");
        while (numList.size() != 1) {
            for (int i = 1; i < k; i++) {
                numList.add(numList.poll());
            }
            System.out.print(numList.poll() + ", ");
        }
        System.out.print(numList.poll()+">");
    }
}
