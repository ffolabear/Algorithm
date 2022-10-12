package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1182 {

    static int N, S, ans;
    static int[] nums;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        nums = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            System.out.println("nums = " + nums[i]);
        }


        if (S == 0) {
            ans += 1;
        }
        rec_func(1, 0);
        System.out.println(ans);
    }

    //k번째 원소를 포함시킬 지 정하는 함수
    //value : k-1 번쨰 원소까지 골라진 원소들의 합
    static void rec_func(int k, int value) {

        if (k == N + 1) { //부분 수열을 하나 완성시킨 상태
            //value 가 S랑 같은지 확인하기
            if (value == S) {
                ans++;
            }
        } else {
            //k 번쨰 원소를 포함시킬지 결정하고 재귀호출

            //include
            rec_func(k + 1, value + nums[k]);

            //not include
            rec_func(k + 1, value);
        }

    }

}
