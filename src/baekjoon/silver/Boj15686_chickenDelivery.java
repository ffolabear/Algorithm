package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj15686_chickenDelivery {

    static int N, M;
    static int[][] city;
    static ArrayList<Node> store;
    static ArrayList<Node> house;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        city = new int[N][N];



        for (int i = 0; i < N; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                city[i][j] = Integer.parseInt(row[j]);
                if (city[i][j] == 1) {
                    house.add(new Node(i, j));

                } else if (city[i][j] == 2) {
                    house.add(new Node(i, j));
                }
            }

        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (city[i][j] == 2) {
                    chickenDistance(i, j);
                }
            }
        }





        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(city[i][j] + " ");
            }
            System.out.println();
        }

    }

    static boolean chickenDistance(int r, int c) {




        return false;
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


