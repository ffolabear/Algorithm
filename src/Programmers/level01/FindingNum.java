package Programmers.level01;

public class FindingNum {

    public int solution(int n) {
        int answer = 0;

        int i = 2;
        int temp = n;

        while (i != n) {
            if (temp % i == 1) {
                answer = i;
                break;
            } else {
                i++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        FindingNum sol = new FindingNum();
//        int n = 10;
        int n = 12;


        System.out.println(sol.solution(n));

    }

}
