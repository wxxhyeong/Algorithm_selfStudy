import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*
백준 3425. 고스택
 */
public class boj3425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> commands = new LinkedList<>();
        LinkedList<Integer> temps = new LinkedList<>();
        boolean state = true;

        while (state) { // quit 나올 때 까지 반복
            while (true) {
                StringTokenizer stk = new StringTokenizer(br.readLine());
                String comm = stk.nextToken();

                if (comm.equals("END")) {
                    break;
                } else if (comm.equals("NUM")) {
                    temps.addLast(Integer.parseInt(stk.nextToken()));
                }
                commands.addLast(comm);
            }

            int n = Integer.parseInt(br.readLine());




        }

    }
}
