package juniorDeveloperEducation.day1;

public class Q1 {

    public int solution(int left, int right) {

        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (calculate(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    private int calculate(int num) {

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Q1 sol = new Q1();

//        int left = 13;
//        int right = 17;

        int left = 24;
        int right = 27;

        sol.solution(left, right);
        System.out.println(sol.solution(left, right));


    }


}
