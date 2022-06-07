package Lecture.greedy;

import java.util.*;

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class WrestlingPlayer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Node> player = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int height = in.nextInt();
            int weight = in.nextInt();
            player.add(new Node(height, weight));
        }

        Collections.sort(player, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o2.x - o1.x;
            }
        });

        int weight = Integer.MIN_VALUE;
        int count = 0;

        for (Node i : player) {
            if (i.y > weight) {
                count++;
                weight = i.y;
            }
        }

        System.out.println(count);
    }
}
