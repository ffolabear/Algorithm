package lecture.twopointer;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeArray_twoPointer_2 {

    private void solution(int N, int[] arr1, int M, int[] arr2) {

        int pointer1 = 0;
        int pointer2 = 0;

        ArrayList<Integer> res = new ArrayList<>();

        while (pointer1 < N && pointer2 < M) {

            if (arr1[pointer1] < arr2[pointer2]) {
                res.add(arr1[pointer1]);
                pointer1++;
            } else if (arr1[pointer1] > arr2[pointer2]) {
                res.add(arr2[pointer2]);
                pointer2++;
            } else {
                res.add(arr1[pointer1]);
                pointer1++;
                res.add(arr2[pointer2]);
                pointer2++;
            }

        }

        //사실 조건문 없어도 동작하긴 한다.
        while (pointer2 < M) {
                res.add(arr2[pointer2]);
                pointer2++;
            }

        while (pointer1 < N) {
                res.add(arr1[pointer1]);
                pointer1++;
            }

//        if (pointer1 == N) {
//
//            while (pointer2 < M) {
//                res.add(arr2[pointer2]);
//                pointer2++;
//            }
//
//        } else if (pointer2 == M) {
//
//            while (pointer1 < N) {
//                res.add(arr1[pointer1]);
//                pointer1++;
//            }
//
//        }



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

        MergeArray_twoPointer_2 sol = new MergeArray_twoPointer_2();
        sol.solution(N, arr1, M, arr2);


    }
}
