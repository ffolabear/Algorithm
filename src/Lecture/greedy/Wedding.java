package Lecture.greedy;

import java.util.*;

public class Wedding {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Node> participant = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int depart = sc.nextInt();
            int arrive = sc.nextInt();
            participant.add(new Node(depart, arrive));
        }

        Collections.sort(participant, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.x - o2.x;
            }
        });

        int last = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < participant.size(); i++) {
            System.out.println("i : " + i + " - " + last);
            Node current = participant.get(i);
            if (current.x < last) {
                count++;
                last = current.y;
            }
        }

        for (Node n : participant) {
            System.out.println(n.x + " " + n.y);
        }

        System.out.println(count);
    }

}
