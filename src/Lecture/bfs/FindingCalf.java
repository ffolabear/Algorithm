package Lecture.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindingCalf {

    static int S;
    static int E;

    static int answer = 0;
    static int[] dis = {1, -1, 5};
    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();


    private void bfs() {

        visited = new boolean[10001];
        visited[S] = true;
        queue.offer(S);
        int level = 0;

        while (!queue.isEmpty()) {

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                //현재 탐색하는 노드
                int current = queue.poll();

                if (current == E) {
                    System.out.println(level);
                    return;
                }

                int forward = current + 1;
                int backward = current - 1;
                int forward5 = current + 5;

                if (!visited[forward]) {
                    queue.offer(forward);
                }

                if (!visited[backward]) {
                    queue.offer(backward);
                }

                if (!visited[forward5]) {
                    queue.offer(forward5);
                }
            }
            level++;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        S = in.nextInt();
        E = in.nextInt();

        FindingCalf sol = new FindingCalf();
        sol.bfs();

    }

}
