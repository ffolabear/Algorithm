package Lecture.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavingPrincess {

    private int solution(int N, int K) {

        Queue<Integer> queue = new LinkedList<>();
        int ans = 0;

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int cnt = 1;

        while (queue.size() > 1) {
            if (cnt == K) {
                queue.poll();
                cnt = 1;
            } else {
                queue.add(queue.poll());
                cnt++;
            }
        }


        ans = queue.poll();

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        SavingPrincess sol = new SavingPrincess();

        System.out.println(sol.solution(N, K));

    }
}
