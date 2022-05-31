package Lecture.dfs;

import java.util.Scanner;

/**
 * DFS 의 기본 아이디어는 같지만, 이전과 다른점은
 * 모든 간선들을 탐색하는 것이 아닌 1인곳에서만 탐색을 시작해야한다는 점이다.
 * 그래서 기존 DFS 는 탈출 조건으로 제약을 걸어줘서 StackOverFlow 를 방지했지만,
 * 이번 문제는 1인곳만 탐색하고 그렇지 않으면 탐색하지 않으므로 따로 dx, dy 테크닉 선에서 탐색 대상이 아니면 끝나게 된다.
 *
 */

public class IslandDfs2 {

    static int N;
    static int ans = 0;
    static int[][] island;

    //기존의 dx, dy 와는 다르게 대각선이 추가되었으므로 값을 추가한다.
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, -1, 1, 1, -1, 1, -1};


    private void dfs(int x, int y) {

        for (int i = 0; i < 8; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && island[nx][ny] == 1) {
                island[nx][ny] = 0;
                dfs(nx, ny);

            }


        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        island = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                island[i][j] = in.nextInt();
            }
        }

        IslandDfs2 sol = new IslandDfs2();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                //탐색 조건
                //탐색을 했다는 것은 섬이라는 뜻이므로 ans 도 같이 증가시켜준다.
                if (island[i][j] == 1) {
                    ans++;
                    sol.dfs(i, j);
                }
            }
        }

        System.out.println(ans);
    }
}
