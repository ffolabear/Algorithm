package Lecture.dfs;

import java.util.Scanner;

/**
 * 2차원 배열에서 탐색을 한다.
 * 배열안의 각 인덱스에는 상하좌우의 인접 요소들이 있고, 그 요소들도
 * 이어진 요소들을 가지고 있으므로 깊이 우선 탐색이 적합하다.
 *
 * 배열내에서 탐색하는 방법은 흔히 dx,dy 테크닉이라고 하는 상하좌우를 탐색하는 방법을 사용하며
 * 탐색한 인접 요소가 0이면 탐색을 이어나가고 1이면 탐색을 중지한다.
 * 탐색을 마친 요소는 1로 바꿔서 중복탐색을 방지한다.
 * 탐색을 시작한 인덱스가 우측 하단에 도달하면 ans 변수의 값을 1증가 시켜준다.
 *
 */

public class FindingMaze2 {

    static int[][] maze = new int[8][8];
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int ans = 0;

    private void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            ans++;
        } else {
            for (int i = 0; i < 4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    dfs(nx, ny);
                    maze[nx][ny] = 0;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = in.nextInt();
            }
        }

        FindingMaze2 sol = new FindingMaze2();
        maze[1][1] = 1;
        sol.dfs(1, 1);

        System.out.println(ans);



    }

}
