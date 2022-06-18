package Lecture.greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class IsFriend {

    static ArrayList<ArrayList<Integer>> relation = new ArrayList<>();

    public static int Find(int v) {

        return 0;
    }

    public static void Union(int a, int b) {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            relation.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            relation.get(a).add(b);
            relation.get(b).add(a);
        }

        int targetFriendA = sc.nextInt();
        int targetFriendB = sc.nextInt();

        for (int i = 0; i < relation.size(); i++) {
            System.out.println(relation.get(i));
        }

        System.out.println(targetFriendA + " " + targetFriendB);
    }

}
