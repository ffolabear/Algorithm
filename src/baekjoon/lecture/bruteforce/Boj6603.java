package baekjoon.lecture.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj6603 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = bf.readLine();
            if (input.equals("0")) {
                break;
            }

            String[] strArr = input.split(" ");

            //뽑아야하는 숫자의 갯수
            int k = Integer.parseInt(strArr[0]);

            //숫자의 갯수를 제외한 숫자배열
            int[] intArr = new int[k];

            //사용했는지 안했는지 체크할 배열
            boolean[] visited = new boolean[k];


            for (int i = 0; i < intArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i + 1]);
            }


            combination(intArr, visited,0, 0, 6);
            System.out.println();


        }

    }

    static void combination(int[] intArr, boolean[] visited, int idx, int count, int k) {

        if (count == k) {
            for (int i = 0; i < intArr.length; i++) {
                if (visited[i]) {
                    System.out.print(intArr[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = idx; i < intArr.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            combination(intArr, visited, i, count + 1, k);
            visited[i] = false;
        }


    }


}
