package Lecture.dp;

import java.util.Arrays;
import java.util.Scanner;

public class ExchangeCoin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] coins = new int[N];


        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        int money = sc.nextInt();

        //dy[i] 금액을 만드는데 사용하는 최소 동전의 갯수
        int[] dy = new int[money + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        Arrays.sort(coins);
        dy[coins[0]] = 1;

        for (int i = 0; i < coins.length; i++) {

            for (int j = coins[0]; j < dy.length; j++) {

                if (j - coins[i] >= 0) {
                    //dy[j] 원을 만들떄 coin[i] 의 동전을 사용한다는 뜻
                    dy[j] = Math.min(dy[j - coins[i]] + 1, dy[j]);
                }
            }
        }

        for (int i : dy) {
            System.out.print(i + " ");
        }

//        System.out.println(dy[money]);
    }

}
