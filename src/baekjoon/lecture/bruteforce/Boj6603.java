package baekjoon.lecture.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj6603 {

    static int k;
    static boolean[] visited;
    static int[] intArr;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = bf.readLine();
            String[] strArr = input.split(" ");

            //뽑아야하는 숫자의 갯수
            k = Integer.parseInt(strArr[0]);

            //숫자의 갯수를 제외한 숫자배열
            intArr = new int[strArr.length - 1];

            //사용했는지 안했는지 체크할 배열
            visited = new boolean[k];

            if (input.equals("0")) {
                break;
            }

            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i + 1]);
            }

            combination(0, 0);



        }

    }

    static void combination(int current, int idx) {

        if (current == k) {
            for (int i = 0; i < k; i++) {
                if (visited[i]) {
                    System.out.print(intArr[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = idx; i < k; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            combination(current + 1, i);
            visited[i] = false;
        }


    }


}
