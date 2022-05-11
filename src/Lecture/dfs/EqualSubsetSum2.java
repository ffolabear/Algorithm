package Lecture.dfs;

import java.util.Scanner;

public class EqualSubsetSum2 {

    static int N;
    static int[] nums;

    //문제에서 요구하는 것이 단순히 조건을 만족하는 집합이 있나 없나 이기 때문에
    //원하는 집합이 있음을 알게된후에는 더이상의 탐색이 필요없으므로 그것을 체크하기 위한 boolean 변수
    static boolean flag = false;

    //처음에는 각 부분집합을 구할때마다 합을 구하는 메서드를 호출하려고 했으나
    //부분집합은 항상 모든 원소를 사용하며 두개만 존재하기 때문에 하나의 합을 파라미터로 넘기면서
    //부분집합을 만들었을때 총합에서 빼변 조건을 만족하는지 여부를 알 수 있다.
    static int total = 0;
    static String ans = "NO";

    //배열의 첫번째 원소부터 쭉 탐색해가기 때문에 방문 배열같은것을 만들 필요가 없음
    private void dfs(int L, int sum) {

        if (flag) {
            return;
        }

        if (sum > total / 2) {
            return;
        }

        //모든 원소를 사용했을때
        if (L == N) {

            if ((sum + sum) == total) {
                ans = "YES";
                flag = true;
            }

        } else {
            dfs(L + 1, sum + nums[L]);
            dfs(L + 1, sum);


        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        nums = new int[N];

        for (int i = 0; i < nums.length; i++) {
            int input = in.nextInt();
            nums[i] = input;
            total += input;
        }

        EqualSubsetSum2 sol = new EqualSubsetSum2();
        sol.dfs(0, 0);
        System.out.println(ans);

    }
}
