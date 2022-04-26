package Lecture.sortingSearching;

import java.util.*;

public class LastRecentlyUsed {


    private void solution(int S, int[] tasks) {

        int[] arr = new int[S];
        for (int i : tasks) {

            int idx = -1;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    idx = j;
                }
            }

            if (idx == -1) {
                for (int k = arr.length - 1; k > 0; k--) {
                    arr[k] = arr[k - 1];
                }
                arr[0] = i;
            } else {

                for (int k = idx; k > 0; k--) {
                    arr[k] = arr[k - 1];
                }
                arr[0] = i;

            }


        }

        for (int l : arr) {
            System.out.print(l + " ");
        }


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int S = in.nextInt();
        int N = in.nextInt();
        int[] tasks = new int[N];
        for (int i = 0; i < N; i++) {
            tasks[i] = in.nextInt();
        }

        LastRecentlyUsed sol = new LastRecentlyUsed();
        sol.solution(S, tasks);

    }
}
