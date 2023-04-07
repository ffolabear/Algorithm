package programmers.chk;

public class sol_342155_873 {

    static int count = 0;

    public int solution(int n) {


        for (int i = 1; i <= n / 2; i++) {
            calc(i, n);
        }

        System.out.println(count + 1);
        return count + 1;
    }

    static void calc(int start, int n) {

        int sum = 0;



        for (int i = start; i <= n; i++) {

            if (sum > n) {
                break;
            }


            sum += i;

            if (sum == n) {
                count++;
                return;
            }


        }

    }


    public static void main(String[] args) {

        sol_342155_873 sol = new sol_342155_873();

        int n = 15;

        sol.solution(n);

    }

}
