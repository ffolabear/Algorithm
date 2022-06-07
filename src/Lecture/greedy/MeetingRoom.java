package Lecture.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingRoom {

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
        int count = Integer.MIN_VALUE;

        for (int i = 0; i < meeting.size(); i++) {
            Node current = meeting.get(i);
            end = current.y;
            int temp = 1;

            for (int j = i + 1; j < meeting.size(); j++) {
                Node next = meeting.get(j);
                if (next.x >= end) {
                    temp++;
                    end = next.y;
                }
            }
            count = Math.max(count, temp);
            System.out.println();
        }

        System.out.println(count);
    }
}
