package lecture.sortingSearching;

import java.util.Scanner;

public class InsertionSort3 {

    private void solution(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            int j;
            int temp = nums[i];

            //현재 대상보다 작은 원소중에서
            //이전원소가 현재 원소보다 클경우를 찾기 위해서 반복문
            for (j = i; j > 0 && nums[j - 1] > temp; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = temp;

        }

        for (int k : nums) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        InsertionSort3 sol = new InsertionSort3();
        sol.solution(nums);

    }

}