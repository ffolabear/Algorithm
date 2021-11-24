package Programmers.level02;

public class Dividing2Arr {

    public int[] solution(int n, long left, long right) {

        StringBuilder sb = new StringBuilder();

        long index = 1;
        int count = 0;

        while (index <= n) {

            for (long i = 1; i <= n; i++) {
                if (count >= left && count <= right) {
                    if (i <= index) {
                        sb.append(index);
                    } else {
                        sb.append(i);
                    }

                } else {
                    count++;
                    continue;
                }
                count++;
            }
            index++;
        }

        System.out.println(sb);

        int[] answer = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            answer[i] = sb.charAt(i) - '0';
        }

        return answer;
    }

    public static void main(String[] args) {

        Dividing2Arr sol = new Dividing2Arr();
        int n = 7;
        int left = 2;
        int right = 5;
        sol.solution(n, left, right);

    }

}
