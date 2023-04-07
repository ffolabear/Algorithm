package juniorDeveloperEducation.day1;

public class Q6 {


    public int[] solution(int n, int m) {

        int[] answer = new int[2];

        int GCD = 0;

        //최대공약수 구하기
        for (int i = 1; i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                GCD = i;
            }
        }

        answer[0] = GCD;

        boolean[] LCM = new boolean[10000001];


        //최소공배수
        for (int i = 1; i <= 1000000; i++) {
            if (i % m == 0) {
                LCM[i] = true;
            }
        }

        for (int i = 1; i <= 1000000; i++) {
            if (i % n == 0) {
                if (LCM[i]) {
                    answer[1] = i;
                    break;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 12;
        Q6 sol = new Q6();
        sol.solution(n, m);


    }

}
