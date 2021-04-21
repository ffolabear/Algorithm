package Programmers.Test;


import java.util.ArrayList;

public class no_duplicate_num {

    public static ArrayList<Integer> solution(int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1]) {

                answer.add(arr[i]);
            }

        }


        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        solution(arr);

    }

}
