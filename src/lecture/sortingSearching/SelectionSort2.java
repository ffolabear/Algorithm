package lecture.sortingSearching;

import java.util.Scanner;

/**
 * 위키 백과보고 선택정렬 구현하기
 *
 * 1. 주어진 리스트 중에 최소값을 찾는다.
 * 2. 그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
 * 3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
 *
 * 수도 코드
 *
 * for i = 0 to n:
 *     a[i]부터 a[n - 1]까지 차례로 비교하여 가장 작은 값이 a[j]에 있다고 하자.
 *     a[i]와 a[j]의 값을 서로 맞바꾼다.
 *
 */

public class SelectionSort2 {

    private void solution(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int idx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[idx] > nums[j]) {
                    idx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;

        }


        for (int i : nums) {
            System.out.print(i + " ");
        }


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        SelectionSort2 sol = new SelectionSort2();
        sol.solution(nums);

    }

}
