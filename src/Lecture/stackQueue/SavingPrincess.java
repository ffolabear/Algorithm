package Lecture.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavingPrincess {

    private int solution(int N, int K) {

        Queue<Integer> queue = new LinkedList<>();

        int cnt = 1;

        for (int i = 1; i <= N; i++) {
            if (cnt == K) {
                queue.poll();
            } else {
                queue.offer(i);
            }


        }

        int ans = 0;


        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
    }
}
