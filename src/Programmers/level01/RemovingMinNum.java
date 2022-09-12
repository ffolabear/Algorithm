package Programmers.level01;

public class RemovingMinNum {

    public int[] solution(int[] arr) {

        int num = Integer.MAX_VALUE;
        int[] answer;

        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            for (int i : arr) {
                num = Math.min(num, i);
            }

            answer = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != num) {
                    answer[i] = arr[i];
                }

            }

        }
        return answer;
    }

    public static void main(String[] args) {

        RemovingMinNum sol = new RemovingMinNum();
        int[] arr = {4, 3, 2, 1};
//        int[] arr = {10};
        sol.solution(arr);

    }

}
