package Programmers.weeklyChallenge.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fee {

    static int price, money, count;

    public long solution(int price, int money, int count) {
        long answer = -1;

        int expected = 0;

        for (int i = 1; i <= count; i++) {
            expected += price * i;

        }

        answer = expected - money;

        if (money >= expected) {
            return 0;
        }

        return answer;
    }

    static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String data = bf.readLine();

        StringTokenizer st = new StringTokenizer(data);
        while (st.hasMoreTokens()) {

            price = Integer.parseInt(st.nextToken());
            money = Integer.parseInt(st.nextToken());
            count = Integer.parseInt(st.nextToken());

        }
    }

    public static void main(String[] args) throws IOException {
        input();
        Fee fee = new Fee();
        fee.solution(price, money, count);

    }
}
