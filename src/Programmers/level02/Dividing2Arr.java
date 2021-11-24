package Programmers.level02;

public class Dividing2Arr {

    public int[] solution(int n, long left, long right) {

        left += 1;
        right += 1;

        int rowLeft = 0;
        int rowRight = 0;

        int length = (int) Math.pow(n, 2);

        for (int i = 1; i <= n; i++) {
            if (left < (long) i * n) {
                rowLeft = i;
                break;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (right < (long) i * n) {
                rowRight = i;
                break;
            }
        }

        System.out.println(left);
        System.out.println(right);

        System.out.println(n * (rowLeft - 1) + " ~ " + n * rowLeft);
        System.out.println(n * (rowRight - 1) + " ~ " + n * rowRight);


        int[] answer = {};


        return answer;
    }

    public static void main(String[] args) {

        Dividing2Arr sol = new Dividing2Arr();
        int n = 7;
        int left = 14;
        int right = 28;
        sol.solution(n, left, right);

    }

}
