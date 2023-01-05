import java.util.Scanner;

public class boj3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] chess = new Integer[6];
        Integer[] rules = {1,1,2,2,2,8};
        for (int i = 0; i < 6; i++) {
            chess[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(rules[i]-chess[i] + " ");
        }
    }
}
