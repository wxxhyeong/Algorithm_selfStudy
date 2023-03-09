package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj14476 {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer stk = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int[] lGcd = new int[n];
        int[] rGcd = new int[n];

        lGcd[0] = arr[0];
        rGcd[n-1] = arr[n - 1];


        for (int i = 1; i < n; i++) {
            lGcd[i] = gcd(lGcd[i - 1], arr[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            rGcd[i] = gcd(arr[i], rGcd[i + 1]);
        }

        /*for (int i : lGcd) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : rGcd) {
            System.out.print(i + " ");
        }
        System.out.println();*/
        int max = -1;
        int k = 0;
        int gcd = 0;



        for (int i = 0; i < n; i++) {
            gcd = 0;
            if (i == 0) {
                gcd = rGcd[i + 1];
            }

            else if (i == n - 1) {
                gcd = lGcd[i - 1];
            }
            else {
                gcd = gcd(lGcd[i - 1], rGcd[i + 1]);
            }

            if (max < gcd && arr[i] % gcd != 0) {
                //System.out.println("arr[i] = " + arr[i]);
                //System.out.println("gcd = " + gcd);
                max = gcd;
                k = arr[i];
            }


        }

        if (max == -1) {
            System.out.println(-1);
        }
        else {
            System.out.println(max + " " + k);
        }

    }
}






/*
package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj14476 {

    static int gcd(int a, int b) {
        if (a%b == 0) {
            return b;
        }
        return gcd(b, a % b);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> queue = new ArrayList<>();
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int k;
        int gcd = -1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(stk.nextToken()));
        }

        Collections.sort(queue);

        for (int i = 0; i < n; i++) {
            k = queue.remove(0);
            //System.out.println("k = " + k);
            //System.out.println("queue = " + queue);
            for (int j = 0; j < n - 2; j++) {
                //System.out.println("j = " + j);
                int temp = gcd(queue.get(j), queue.get(j+1));
                if (k % gcd(queue.get(j), queue.get(j + 1)) != 0) {
                    int temp2 = gcd;
                    gcd = Math.max(gcd, temp);
                    if (temp2 < gcd) {
                        ans = k;
                    }
                }
            }
            queue.add(k);
            //System.out.println("queue = " + queue);
        }

        if (gcd == -1) {
            System.out.println(-1);
        }
        else {
            System.out.println(gcd + " " + ans);
        }
    }
}
*/
