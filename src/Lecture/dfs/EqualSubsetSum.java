package Lecture.dfs;

import java.util.Scanner;

public class EqualSubsetSum {

    static int[] nums;
    static boolean[] visited;

    private void solution() {

    }

    static int subsetSum() {

        int sumVisit = 0;
        int sumRest = 0;

        for (int i = 0; i < visited.length; i++) {
            if (visited[i]) {
                sumVisit += nums[i];
            } else {
                sumRest += nums[i];
            }

        }

        return 0;
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int N = in.nextInt();
        nums = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }

        EqualSubsetSum sol = new EqualSubsetSum();
        sol.solution();

    }

}
