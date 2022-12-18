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

import java.util.*;
import java.io.*;

public class A2 {
    static int[] toX = {0, 1, 0, -1};
    static int[] toY = {1, 0, -1, 0};
    static int[][] max;
    static int T, N, M, K;

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        T = sc.nextInt();

        for (int t = 1; t <= T; ++t) {
            int minCount = solve(sc);
            System.out.println(String.format("#%d %d", t, minCount));
        }
    }

    public static int solve(Scanner sc) {
        // take inputs
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        int[][] space = new int[N + 1][M + 1];
        max = new int[N + 1][M + 1];

        for (int i = 1; i <= N; ++i) {
            String input = sc.next();
            for (int j = 0; j < M; ++j) {
                if (input.charAt(j) == '#') {
                    space[i][j + 1] = -1;
                }
            }
        }

        for (int i = 0; i < K; ++i) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            space[x][y] = 1;
        }

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= M; ++j) {
                if (space[i][j] == 1) {
                    if (bfs(copySpace(space), i, j) != K) {
                        return -1;
                    }
                }
            }
        }

        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= M; ++j) {
                if (max[i][j] > 0) {
                    minValue = Math.min(minValue, max[i][j]);
                }
            }
        }

        return minValue;
    }

    public static int[][] copySpace(int[][] space) {
        int[][] newSpace = new int[N + 1][M + 1];

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= M; ++j) {
                newSpace[i][j] = space[i][j];
            }
        }

        return newSpace;
    }

    // 0 : 아무것도 없는 상태, -1 : 장애물 , 1 : 인화물질, 2 : 진화상태
    public static int bfs(int[][] space, int x, int y) {
        Queue<Point2> queue = new LinkedList<>();
        queue.offer(new Point2(x, y));

        int count = 1;
        int step = 0;
        space[x][y] = 2;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int k = 0; k < len; ++k) {
                Point2 p = queue.poll();
                // update values
                max[p.x][p.y] = Math.max(max[p.x][p.y], step);

                for (int i = 0; i < 4; ++i) {
                    int nextX = p.x + toX[i];
                    int nextY = p.y + toY[i];

                    // check out of range and already taken
                    if (nextX < 1 || nextY < 1 || nextX > N || nextY > M || !canMove(space, nextX, nextY)) {
                        continue;
                    }

                    if (space[nextX][nextY] == 1) {
                        ++count;
                    }

                    space[nextX][nextY] = 2;
                    queue.offer(new Point2(nextX, nextY));

                }
            }
            ++step;
        }

        return count;

    }

    public static boolean canMove(int[][] space, int x, int y) {
        return space[x][y] == 0 || space[x][y] == 1;
    }

}

class Point2 {
    int x;
    int y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
