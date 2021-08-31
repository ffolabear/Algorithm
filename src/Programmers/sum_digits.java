package Programmers;

public class sum_digits {

    public static int solution(int n) {

        String covt = Integer.toString(n);
        char[] nums = covt.toCharArray();
        int answer = 0;

        for (int i=0; i < nums.length; i++){
            answer += nums[i] - '0';
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        int n = 123;
        solution(n);
    }

}
