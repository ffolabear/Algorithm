package lecture.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private int solution(int[] nums, int M) {

        Arrays.sort(nums);


        int start = 0;
        int end = nums.length - 1;
        int middle;

        while (start <= end) {

            middle = (end + start) / 2;
            if (nums[middle] == M) {
                return middle + 1;
            }

            if (M < nums[middle]) {
                end = middle - 1;
            } else if (M > nums[middle]) {
                start = middle + 1;

            }

        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        BinarySearch sol = new BinarySearch();
        System.out.println(sol.solution(nums, M));

    }
}
