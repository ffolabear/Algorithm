package Lecture.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElement {

    private void solution(int[] arr1, int[] arr2) {

        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < arr1.length && pointer2 < arr2.length) {

            if (arr1[pointer1] < arr2[pointer2]) {
                pointer1++;
            } else if (arr1[pointer1] > arr2[pointer2]) {
                pointer2++;
            } else {
                res.add(arr1[pointer1]);
                pointer1++;
                pointer2++;
            }

        }

        //만약 두 배열의 길이가 달라서 한쪽이 먼저 끝났을 때
        //2번 배열이 더 짧음 -> 2번 배열의 마지막 원소랑만 비교하면됨
        while (pointer1 < arr1.length) {
            if (arr1[pointer1] == arr2[arr2.length - 1]) {
                res.add(arr1[pointer1]);
                pointer1++;
            } else {
                pointer1++;
            }
        }

        //1번 배열이 더 짧음 -> 1번 배열의 마지막 원소랑만 비교하면됨
        while (pointer2 < arr2.length) {
            if (arr2[pointer2] == arr1[arr1.length - 1]) {
                res.add(arr2[pointer2]);
                pointer2++;
            } else {
                pointer2++;
            }
        }

        for (int i : res) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = in.nextInt();
        }

        int M = in.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = in.nextInt();
        }

        CommonElement sol = new CommonElement();
        sol.solution(arr1, arr2);

    }
}
