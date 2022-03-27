package Lecture.array;

import java.util.Scanner;

public class PrintBigNum {

    private void solution(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append(" ");

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                sb.append(nums[i]).append(" ");
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        PrintBigNum sol = new PrintBigNum();
        sol.solution(nums);

    }

}
