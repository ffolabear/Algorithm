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

    static int N, M;

    static int[][] map;
    static int[] combi;
    static ArrayList<Point> house, pizza;

    private void dfs(int L, int s) {

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        house = new ArrayList<>();
        pizza = new ArrayList<>();
        combi = new int[M];

        map = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (map[i][j] == 1) {
                    house.add(new Point(i, j));
                } else if (map[i][j] == 2){
                    pizza.add(new Point(i, j));
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }

}
