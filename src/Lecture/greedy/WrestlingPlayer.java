package Lecture.greedy;

import java.util.*;

class Info {
    int h;
    int w;

    public Info(int h, int w) {
        this.h = h;
        this.w = w;
    }
}

public class WrestlingPlayer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Info> player = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int height = in.nextInt();
            int weight = in.nextInt();
            player.add(new Info(height, weight));
        }

        Collections.sort(player, new Comparator<Info>() {
            @Override
            public int compare(Info o1, Info o2) {
                return o2.h - o1.h;
            }
        });

        int weight = Integer.MIN_VALUE;
        int count = 0;

        for (Info i : player) {
            if (i.w > weight) {
                count++;
                weight = i.w;
            }
        }

        System.out.println(count);
    }
}
