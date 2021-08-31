package Programmers.BruteForce;

import java.util.Arrays;

public class finding_primeNum {

    public int solution(String numbers) {

        String[] nums = numbers.split("");

        Arrays.sort(nums);

        for (String num : nums) {
            System.out.println(num);
        }





        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {

        finding_primeNum sol = new finding_primeNum();
        String numbers = "71";
        sol.solution(numbers);


    }


}
