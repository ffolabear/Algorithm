package Lecture.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class WrestlingPlayer3 {

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

        int cnt = 0;
        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).y > max) {
                cnt++;
                max = list.get(i).y;
            }
        }

        System.out.println(cnt);


    }
}
