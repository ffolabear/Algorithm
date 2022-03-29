package Lecture.twopointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeArray {

    private void solution(int[] arr1, int[] arr2) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            res.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            res.add(arr2[i]);
        }

        Collections.sort(res);
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

        MergeArray sol = new MergeArray();
        sol.solution(arr1, arr2);


    }
}
