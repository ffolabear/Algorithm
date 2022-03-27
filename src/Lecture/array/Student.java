package Lecture.array;

import java.util.Scanner;

public class Student {

    private int solution(int[] heights) {

        int ans = 0;
        int last = 0;

        for (int i = 0; i < heights.length; i++) {

            if (heights[i] > last) {
                ans++;
                last = heights[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] heights = new int[N];

        for (int i = 0; i < N; i++) {
            heights[i] = in.nextInt();
        }

        Student sol = new Student();

        System.out.println(sol.solution(heights));

    }
}
