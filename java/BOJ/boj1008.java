/*
백준 1008. A/B
 */
import java.util.Scanner;

public class boj1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        double res = (double) a / b;
        System.out.println(res);


    }
}
