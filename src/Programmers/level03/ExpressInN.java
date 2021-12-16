package Programmers.level03;

import java.util.HashSet;

public class ExpressInN {

    static HashSet<Integer>[] combination;
    static int target;


    public int solution(int N, int number) {

        target = N;
        combination = new HashSet[9];
        for (int i = 1; i <= 8; i++) {
            getNum(i);

            if (combination[i].contains(number)) {
                return i;
            }

        }

        int answer = -1;
        return answer;
    }

    static HashSet<Integer> getNum(int cnt) {

        //size != 0 일때 에러남
        if (combination[cnt] != null) {
            return combination[cnt];
        }


        int num = 0;
        for (int i = 0; i < cnt; i++) {
            num = 10 * num + target;
        }

        combination[cnt] = new HashSet<>();
        combination[cnt].add(num);

        for (int i = 1; i <= cnt; i++) {

            if (combination[i] != null || combination[cnt - i] != null) {
                getNum(i);
                getNum(cnt - i);
            }

            for (int n1 : combination[i]) {
                for (int n2 : combination[cnt - i]) {
                    combination[cnt].add(n1 + n2);
                    combination[cnt].add(n1 - n2);
                    combination[cnt].add(n1 * n2);

                    if (n2 != 0) {
                        combination[cnt].add(n1 / n2);
                    }

                }
            }


        }

        return combination[cnt];
    }

    public static void main(String[] args) {

        int N = 5;
        int number = 12;
        ExpressInN sol = new ExpressInN();
        sol.solution(N, number);


    }

}
