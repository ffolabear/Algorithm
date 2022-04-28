package Lecture.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindingCalf {

    static int E;
    static int max;
    static int temp = Integer.MIN_VALUE;

    private void bfs(int S) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(S);

        int L = 0;
        while (!queue.isEmpty()) {

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int current = queue.poll();

                queue.offer(current - 1);
                queue.offer(current + 1);
                queue.offer(current + 5);
                L++;

            }


        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        E = in.nextInt();
        max = E - S;
        FindingCalf sol = new FindingCalf();
        sol.bfs(S);

    }

}
