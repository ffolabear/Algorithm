package Lecture.dfs;

import java.util.Scanner;

public class Subset {

    static int N;
    static boolean[] visited;

    private void DFS(int current) {

        //종착역
        if (current == N + 1) {
            for (int i = 1; i < visited.length; i++) {
                if (visited[i]) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        } else {

            visited[current] = true;
            //왼쪽
            DFS(current + 1);
            visited[current] = false;

            //오른쪽
            DFS(current + 1);

            System.out.println();

        }
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        Subset sol = new Subset();
        visited = new boolean[N + 1];
        sol.DFS(1);
    }

}
