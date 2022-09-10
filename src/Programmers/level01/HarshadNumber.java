package Programmers.level01;

public class HarshadNumber {

    public boolean solution(int x) {
        boolean answer = false;

        char[] arr = String.valueOf(x).toCharArray();
        int sum = 0;

        for (char c : arr) {
            sum += c - '0';
        }

        if (x % sum == 0) {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {

        HarshadNumber sol = new HarshadNumber();
        int arr = 12;
        sol.solution(arr);

    }
}
