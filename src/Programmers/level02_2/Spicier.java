package Programmers.level02_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Spicier {

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }

        int cnt = 0;

        while (true) {
            if (queue.peek() >= K) {
                break;
            } else {
                if (queue.size() == 1) {
                    return -1;
                }
                int combine = queue.poll() + queue.poll() * 2;
                queue.add(combine);
                cnt++;
            }


        }

        System.out.println("cnt = " + cnt);
        return cnt;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int K = Integer.parseInt(br.readLine());
//        int[] scoville = new int[K];

//        for (int i = 0; i < K; i++) {
//            scoville[i] = Integer.parseInt(br.readLine());
//        }

        int K = 7;
        int[] scoville = {1, 2, 3, 9, 10, 12};

        Spicier sol = new Spicier();

        System.out.println(sol.solution(scoville, K));


    }

}
