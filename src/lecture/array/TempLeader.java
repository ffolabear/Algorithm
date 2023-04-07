package lecture.array;

import java.io.IOException;
import java.util.Scanner;

public class TempLeader {

    private int solution(int[][] student, int N) {

        int[] ans = new int[student.length];
        int last = Integer.MIN_VALUE;
        int leader = 0;

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 5; k++) {
                    if (student[i][k] == student[j][k]) {
                        cnt++;
                        break;

                    }
                }
            }

            if (cnt > last) {
                last = cnt;
                leader = i;
            }
        }

        return leader + 1;
    }

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] student = new int[N][5];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                student[i][j] = in.nextInt();
            }

        }


        TempLeader sol = new TempLeader();
        System.out.println(sol.solution(student, N));

    }
}
