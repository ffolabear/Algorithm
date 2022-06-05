package Lecture.dfs;

import java.util.ArrayList;
import java.util.Scanner;

class Point{
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class PizzaDelivery {

    static int N, M, len;
    static int answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> house, pizza;

    private void dfs(int L, int s) {
        if (L == M) {
            int sum = 0;
            for (Point hs : house) {
                int distance = Integer.MAX_VALUE;
                for (int i : combi) {
                    distance = Math.min(distance, (Math.abs(pizza.get(i).x - hs.x)) + (Math.abs(pizza.get(i).y - hs.y)));
                }
                sum += distance;
            }
            answer = Math.min(answer, sum);

        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                dfs(L + 1, i + 1);
            }


        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        house = new ArrayList<>();
        pizza = new ArrayList<>();
        combi = new int[M];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    house.add(new Point(i, j));
                } else if (temp == 2){
                    pizza.add(new Point(i, j));
                }
            }
        }

        len = pizza.size();

        PizzaDelivery sol = new PizzaDelivery();
        sol.dfs(0, 0);
        System.out.println(answer);
    }

}
