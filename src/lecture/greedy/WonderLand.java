package lecture.greedy;

import java.util.ArrayList;
import java.util.Scanner;

class Edge2 {

    int a;
    int b;
    int c;

    public Edge2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class WonderLand {

    static int[] unf;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        unf = new int[V + 1];
        ArrayList<Edge2> arr = new ArrayList<>();

        for (int i = 1; i <= V; i++) {
            unf[i] = i;
        }


        for (int i = 0; i < E; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            arr.add(new Edge2(a, b, c));
        }

    }

}
