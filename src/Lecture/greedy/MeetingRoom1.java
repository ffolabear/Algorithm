package Lecture.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingRoom1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Node> meeting = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            meeting.add(new Node(start, end));
        }

        Collections.sort(meeting, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.y == o2.y) {
                    return o1.x - o2.x;
                } else {
                    return o1.y - o2.y;

                }
            }
        });

        int end = 0;
        int count = 0;

        for (Node node : meeting) {
            if (node.x >= end) {
                count++;
                end = node.y;
            }
        }

        System.out.println(count);
    }
}
