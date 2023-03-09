// 백준 2960 에라토스테네스의 체
// n까지의 수 중에서 가장 작은 소수를 제거하고, 그 수의 배수 또한 제거한다.
// k번째로 제거하게 되는 수가 무엇인지 구하여라.
package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n, k;
        n = Integer.parseInt(stk.nextToken());
        k = Integer.parseInt(stk.nextToken());

        System.out.println(solution(n,k));
    }

    static int solution(int n, int k) {
        int cnt = 0;
        boolean[] isPrime = new boolean[1001]; // n의 입력이 1000까지 밖에 안나오므로 생성 (배열의 초기값은 false)

        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) { //방문한 소수인지 아닌지 체크
                for (int j = i; j <= n; j += i) {
                    if (!isPrime[j]) {
                        isPrime[j] = true;
                        cnt++;
                    }
                    if (cnt == k) {
                        return j;
                    }
                }
            }
        }
        return 0;
    }
}
