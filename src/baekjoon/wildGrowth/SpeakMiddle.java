package baekjoon.wildGrowth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SpeakMiddle {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
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
            minHeap.add(input);

        }

//        System.out.println(maxHeap);
//        System.out.println(minHeap);

        int size = maxHeap.size();

        for (int i = 0; i < size; i++) {
            System.out.print(maxHeap.poll() + " ");
        }

        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(minHeap.poll() + " ");
        }

    }
}
