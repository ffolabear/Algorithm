package Lecture.bfs;

import java.util.*;

public class Tomato {

    static int[][] box;
    static int[][] chk;

    static List<Node> tomatoes = new ArrayList<>();

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    Queue<Node> queue = new LinkedList<>();

    private void bfs() {

        for (Node node : tomatoes) {

            queue.offer(node);
            chk[node.x][node.y] = 0;

            while (!queue.isEmpty()) {

                Node current = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int nx = current.x + dx[i];
                    int ny = current.y + dy[i];


                }
            }



        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();

        box = new int[N + 1][M + 1];
        chk = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                box[i][j] = in.nextInt();
                if (box[i][j] == 1) {
                    tomatoes.add(new Node(i, j));
                }
            }
        }

//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= M; j++) {
//                System.out.print(box[i][j] + " ");
//            }
//            System.out.println();
//        }

        Tomato sol = new Tomato();
        System.out.println(tomatoes);
        for (Node n : tomatoes) {
            System.out.println(n.x + " " + n.y);
        }
        sol.bfs();

    }

}
