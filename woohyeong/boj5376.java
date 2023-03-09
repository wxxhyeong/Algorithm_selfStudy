package woohyeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5376 {

    static long gcd(long a1, long b1) {


        if (a1 % b1 == 0)
            return b1;
        else
            return gcd(b1, a1 % b1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            boolean isRepeat = false;
            int start = 0;
            StringBuilder sbNum = new StringBuilder();

            String input = br.readLine();
            input = input.substring(2);

            for (int k = 0; k < input.length(); k++) {
                if (input.charAt(k) == '(') {
                    start = k;
                    isRepeat = true;
                }
                else if (input.charAt(k) != ')'){
                    sbNum.append(input.charAt(k));
                }
            }

            //System.out.println("sbNum = " + sbNum);
            //System.out.println("start = " + start);
            long sN; //분자
            long pN; //분모
            if (start == 0 && !isRepeat) {
                sN = Long.parseLong(sbNum.toString());
                pN = (long)Math.pow(10, sbNum.length());

            }
            else {
                if (start == 0) {
                    sN = Long.parseLong(sbNum.toString());
                }
                else {
                    sN = Long.parseLong(sbNum.toString()) - Long.parseLong(sbNum.substring(0, start));
                }
                pN = (long) Math.pow(10, sbNum.length()) - (long) Math.pow(10, start);
            }
            //System.out.println("sN = " + sN);
            //System.out.println("pN = " + pN);

            long gcd = gcd(sN, pN);
            //System.out.println("gcd = " + gcd);
            sN /= gcd;
            pN /= gcd;
            //sb.append(sN + "/" + pN +"\n");
            System.out.println(sN + "/" + pN );

        }

        //System.out.println(sb.toString());
    }
}
