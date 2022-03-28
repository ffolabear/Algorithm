package Lecture.array;

import java.util.Scanner;

public class Peaks {


    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    private int solution(int[][] peaks, int N) {

        int ans = 0;

//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                int current = peaks[i][j];
//
//                if (current > peaks[i-1][j] &&
//                    current > peaks[i][j-1] &&
//                    current > peaks[i + 1][j] &&
//                    current > peaks[i][j + 1]
//                ) {
//                    ans++;
//
//                }
//            }
//        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {

                int current = peaks[i][j];
                int search = 0;
                boolean isValid = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    search = peaks[nx][ny];

                    if (current <= search) {
                        isValid = false;
                    }
                }

                if (isValid) {
                    ans++;
                }
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] peaks = new int[N + 2][N + 2];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                peaks[i][j] = in.nextInt();
            }
        }


        Peaks sol = new Peaks();
        System.out.println(sol.solution(peaks, N));
    }
}
