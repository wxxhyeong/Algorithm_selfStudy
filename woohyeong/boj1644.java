package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj1644 {

    static int N = 4000000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        ArrayList<Integer> primeNums = new ArrayList<>();

        // 수가 소수인지 아닌지를 판별하는 배열 생성
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i * i <= N; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        primeNums.add(1);

        for (int i = 2; i <= input; i++) {
            if (!isPrime[i]) {
                primeNums.add(i); // 소수 집합 생성
            }
        } // 여기까지 사전작업
        int start = 1;
        int end = 1;

        int sum = 0;
        if (primeNums.size() >= 2)
            sum = primeNums.get(start); //초기값 설정

        int answer = 0;

        while (end < primeNums.size()) {
            if (sum >= input) {
                if (sum == input) {
                    answer += 1;
                }
                sum -= primeNums.get(start);
                start++;
            }
            else {
                end += 1;
                if (end == primeNums.size())
                    break;
                sum += primeNums.get(end);
            }
        }
        System.out.println(answer);
    }
}