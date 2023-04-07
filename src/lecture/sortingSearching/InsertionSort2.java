package lecture.sortingSearching;

import java.util.Scanner;

/**
 * 위키 백과보고 삽입정렬 구현하기
 *
 * 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 정렬
 *
 */

public class InsertionSort2 {

    private void solution(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int j = i - 1;
            int temp = nums[i];

            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = temp;

            for (int h : nums) {
                System.out.print(h + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        InsertionSort2 sol = new InsertionSort2();
        sol.solution(nums);

    }
}
