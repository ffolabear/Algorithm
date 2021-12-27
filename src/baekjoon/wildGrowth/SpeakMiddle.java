package baekjoon.wildGrowth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SpeakMiddle {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });


        for (int i = 0; i < N; i++) {

            int input = Integer.parseInt(bf.readLine());
            maxHeap.add(input);

            //maxHeap : 1
            //minHeap : -

            //maxHeap : 2
            //minHeap : -

            if ((maxHeap.size() + minHeap.size()) % 2 != 0) {
                minHeap.add(maxHeap.poll());

            } else {
                //중간값을 설정해주는 작습
                if (minHeap.peek() > input) {
                    maxHeap.add(minHeap.poll());
                    minHeap.add(maxHeap.poll());
                }

            }


            sb.append(minHeap.peek()).append("\n");
            System.out.println();
        }



        System.out.println(sb);

    }
}
