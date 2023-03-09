package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1735 {

    static int gcd(int a1, int b1) {


        if (a1 % b1 == 0)
            return b1;
        else
            return gcd(b1, a1 % b1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a, b, c ,d;
        int s,p;
        a = Integer.parseInt(stk.nextToken());
        b = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());
        c = Integer.parseInt(stk.nextToken());
        d = Integer.parseInt(stk.nextToken());

        s = a*d + b*c;
        p = b*d;

        int gcdNum = gcd(s, p);
        System.out.println(s/gcdNum+" "+p/gcdNum);

        /*int v = Math.min(s, p);

        while (v > 0) {
            if (s % v == 0) {
                if (p % v == 0) {
                    s /= v;
                    p /= v;

                    break;
                }
            }
            v -= 1;
        }*/

        //System.out.println(s + " " + p);
    }
}
