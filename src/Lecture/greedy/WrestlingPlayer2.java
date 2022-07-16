package Lecture.greedy;

import java.util.*;


public class WrestlingPlayer2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<Node> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int weight = in.nextInt();
            int height = in.nextInt();
            list.add(new Node(weight, height));
        }

        Collections.sort(list, new Comparator<Node>() {

            @Override
            public int compare(Node o1, Node o2) {

                return o2.x - o1.x;
            }
        });

        int weight = 0;
        int count = 0;

        for (Node n : list) {

            if (n.y > weight) {
                weight = n.y;
                count++;
            }

        }

        System.out.println(count);
    }
}
