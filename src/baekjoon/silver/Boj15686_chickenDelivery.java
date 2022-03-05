package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj15686_chickenDelivery {

    static int N, M, ans;
    static int[][] city;
    static boolean[] visited;
    static ArrayList<Node> chicken = new ArrayList<>();
    static ArrayList<Node> house = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        city = new int[N][N];



        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                city[i][j] = Integer.parseInt(row[j]);
                if (city[i][j] == 1) {
                    house.add(new Node(i, j));

                } else if (city[i][j] == 2) {
                    chicken.add(new Node(i, j));
                }
            }

        }
        ans = Integer.MAX_VALUE;
        visited = new boolean[chicken.size()];
        chickenDistance(0, 0);


        bw.write(ans);
        bw.flush();
        bw.close();

    }

    static void chickenDistance(int idx, int cnt) {

        if (cnt == M) {

            int res = 0;

            for (int i = 0; i < house.size(); i++) {
                int temp = Integer.MAX_VALUE;

                for (int j = 0; j < chicken.size(); j++) {
                    if (visited[j]) {

                        int distance = Math.abs(house.get(i).x - chicken.get(j).x) + Math.abs(house.get(i).y - chicken.get(j).y);
                        temp = Math.min(temp, distance);
                    }
                }
                res += temp;
            }
            ans = Math.min(ans, res);
            return;

        }

        for (int i = idx; i < chicken.size(); i++) {
            visited[i] = true;
            chickenDistance(idx+1, cnt+1);
            visited[i] = false;
        }
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}


