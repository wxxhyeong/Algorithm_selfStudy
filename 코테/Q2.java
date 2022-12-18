/*
sds 알고리즘 코테 3. 플래시 포인트

공사 현장에 화재가 발생하였다. 진화 장비 1개를 사용하여 화재를 진압하는데 소요되는 최소
시간을 구하는 프로그램을 작성하세요.
진화 장비는 상하좌우 인접한 위치로만 퍼져나간다.

Example)

input

2
5 6 4
...#..
...#..
..#..#
.#....
....#.
4 3
5 4
2 5
3 2
7 7 5
....#..
.#..#..
......#
.#.....
.#..#..
.....#.
....#..
6 5
5 7
5 6
2 4
6 7

output
#1 5
#2 4
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Q2 {

    static int n, m, k;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static BufferedReader br;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader((System.in)));
        int test = Integer.parseInt(br.readLine());

        for (int i = 0; i < test; i++) {
            solution();
        }

    }

    public static void solution() throws IOException {
        StringTokenizer stk = new StringTokenizer(br.readLine());

        n = Integer.parseInt(stk.nextToken());
        m = Integer.parseInt(stk.nextToken());
        k = Integer.parseInt(stk.nextToken());

        visited = new boolean[n][m];
        graph = new int[n+1][m+1];


        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= m; j++) {
                if (line.charAt(j-1) == '#') {
                    graph[i][j] = -1;
                }

            }
        }

        for (int i = 0; i < k; i++) {
            stk = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stk.nextToken());
            int y = Integer.parseInt(stk.nextToken());

            graph[x][y] = 1;

        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                bfs(copyGraph(), i, j);

            }
        }

    }

    public static int[][] copyGraph() {
        int[][] copyGraph = new int[n + 1][m + 1];

        for (int i = 1; i <= n; ++i) {
            if (m >= 0) System.arraycopy(graph[i], 1, copyGraph[i], 1, m);
        }
        return copyGraph;
    }

    public static void bfs(int[][] graph, int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));

        int cnt = 1;
        int step = 0;
        graph[x][y] = 2;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Point p = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];

                    if (nx < 1 || ny < 1 || nx > n || ny > m || !Move(graph, nx, ny)) {
                        continue;
                    }

                    if (graph[nx][ny] == 1) {
                        cnt++;
                    }

                    graph[nx][ny] = 2;
                    queue.offer(new Point(nx, ny));

                }
            }
        }
    }

    public static boolean Move(int[][] graph, int x, int y) {
        return graph[x][y] == 0 || graph[x][y] == 1;
    }



}
}
