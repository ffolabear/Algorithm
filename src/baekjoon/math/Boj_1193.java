package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int sum = 1;
        int row = 1;

        int x = 1;
        int y = 1;


        for (int i = 2; sum < N; i++) {
            sum += i;
            row++;
        }



        if (row % 2 == 1) {
            //줄 마다 분자 분모의 합계는 줄 + 1
            //줄 번호가 홀수일떄는 ↗
            //그래서 분자는 줄 + 1 에서 입력받은 수와 줄의 최댓값의 차만큼 뺴주고
            //분모는 반대

            x = row - (row - (sum - N)) + 1;
            y = 1 + (row - (sum - N)) - 1;

        } else {

            //줄 번호가 짝수일떄는 ↙

            x = 1 + (row - (sum - N)) - 1;
            y = row - (row - (sum - N)) + 1;

        }


        System.out.println(x + "/" + y);


    }
}
