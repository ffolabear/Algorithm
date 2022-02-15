package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1966_printerQueue {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            //문서의 갯수
            int N = Integer.parseInt(st.nextToken());
            //궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는
            int M = Integer.parseInt(st.nextToken());


        }

    }

}
