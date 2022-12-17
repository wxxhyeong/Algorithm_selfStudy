import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q1 {

    public static void main(String[] args) throws IOException {

        /*BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());

        String A = stk.nextToken();
        String B = stk.nextToken();

        System.out.println("A = " + A);
        System.out.println("B = " + B);
*/
        Q1 q1 = new Q1();
        q1.solution();


    }

    public void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int test = Integer.parseInt(br.readLine());
        System.out.println("test = " + test);

        for (int i = 0; i < test; i++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> numbers = new ArrayList<>(n);
            StringTokenizer stk = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                numbers.add(Integer.parseInt(stk.nextToken()));
            }
            System.out.println("numbers = " + numbers);

        }
    }
}
