package Lecture.SortingSearching;

import java.util.*;

public class LastRecentlyUsed {

    static int[] arr;

    private void solution(int S, int[] tasks) {

        arr = new int[S];

        for (int i = 0; i < tasks.length; i++) {
            System.out.println("현재작업 : " + tasks[i]);

            if (find(tasks[i])) {
            }

//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == tasks[i]) {
//                    cacheHit(tasks[i], j);
//                    System.out.println();
//                    break;
//                }
//            }
//
//            cacheMiss(tasks[i]);
//            System.out.println();
        }

    }

    private boolean find(int task) {

        boolean isValid = false;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == task) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }

    private void cacheMiss(int task) {

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = task;
        System.out.print("MISS : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    private void cacheHit(int task, int idx) {

        System.out.println("[" + idx + "]");

        for (int i = idx; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = task;

        System.out.print("MISS : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

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
