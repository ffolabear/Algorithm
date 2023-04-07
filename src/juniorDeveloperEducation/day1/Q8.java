package juniorDeveloperEducation.day1;

public class Q8 {

    public int solution(int n) {

        int answer = 0;
        int end = (int)Math.sqrt(n);
        boolean[] nums = new boolean[n + 1];


        for (int i = 2; i <= end; i++) {

            for (int j = 1; j * i <= n; j++) {
                nums[j * i] = true;
                System.out.println(j * i);
            }

            nums[i] = !isValid(i);

        }




        for (int i = 2; i < nums.length; i++) {
            if (!nums[i]) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isValid(int num) {

        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }

        if (cnt == 2) {
            return true;
        } else {
            return false;
        }



    }


    public static void main(String[] args) {

        int n = 10;

        Q8 sol = new Q8();
        sol.solution(n);
    }

}
