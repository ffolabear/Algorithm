package Programmers.level02;

import java.util.ArrayList;

public class FindingPrimeNum {

    static ArrayList<Integer> arr = new ArrayList<>();

    static String[] nums;
    static boolean[] visited;

    static int terminate;


    public int solution(String numbers) {

        terminate = numbers.length();
        int answer = 0;

        nums = numbers.split("");

        for (int i = 0; i < nums.length; i++) {


            StringBuilder sb = new StringBuilder();

            combination(visited, i, sb);
            System.out.println(sb);

        }


        return answer;
    }

    static void combination(boolean[] visited, int index, StringBuilder sb) {

        visited = new boolean[nums.length];
        visited[index] = true;

        if (sb.length() == terminate) {
            System.out.println("종료");

        } else {

            for (int i = 0; i < visited.length; i++) {
                if (!visited[i]){
                    sb.append(nums[i]);
                    combination(visited, i, sb);
                }
            }



        }





    }

    public static void main(String[] args) {

        String numbers = "123";
        FindingPrimeNum sol = new FindingPrimeNum();
        sol.solution(numbers);

    }
}
