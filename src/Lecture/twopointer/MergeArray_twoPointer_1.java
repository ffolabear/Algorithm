package Lecture.twopointer;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeArray_twoPointer_1 {

    private void solution(int[] arr1, int[] arr2) {

        int pointer1 = 0;
        int pointer2 = 0;

        ArrayList<Integer> res = new ArrayList<>();

        while (res.size() < arr1.length + arr2.length) {

            if (pointer1 > arr1.length - 1) {
                pointer1 = arr1.length - 1;
            }

            if (pointer2 > arr2.length - 1) {
                pointer2 = arr2.length - 1;
            }

            if (arr1[pointer1] > arr2[pointer2]) {
                res.add(arr2[pointer2]);
                arr2[pointer2] = Integer.MAX_VALUE;
                pointer2++;

            } else if (arr1[pointer1] == arr2[pointer2]) {
                res.add(arr1[pointer1]);
                res.add(arr2[pointer2]);
                arr1[pointer1] = Integer.MAX_VALUE;
                arr2[pointer2] = Integer.MAX_VALUE;
                pointer1++;
                pointer2++;

            } else {
                //arr1[pointer1] < arr2[pointer2]
                res.add(arr1[pointer1]);
                arr1[pointer1] = Integer.MAX_VALUE;
                pointer1++;
            }

        }

        for (int i : res) {
            System.out.println(i + " ");
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

        MergeArray_twoPointer_1 sol = new MergeArray_twoPointer_1();
        sol.solution(arr1, arr2);


    }
}
