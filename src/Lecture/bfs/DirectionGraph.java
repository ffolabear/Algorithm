package Lecture.bfs;

import java.util.Scanner;

/**
 * 그래프와 인접행렬
 * 노드에서 노드로 이동할때 정해진 방향으로만 이동가능한 그레프
 */
public class DirectionGraph {

    static int[][] graph;

    //정점의 갯수
    static int n;

    //간선의 갯수
    static int m;

    static int answer = 0;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

    }

}
