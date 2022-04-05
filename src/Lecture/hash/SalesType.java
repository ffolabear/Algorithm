package Lecture.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalesType {

    private void solution(int[] sales, int K) {

        ArrayList<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> type = new HashMap<>();
        //true : 이미 존재
        //false : 존재 X

        for (int i = 0; i < K; i++) {
            if (type.containsKey(sales[i])) {
                type.put(sales[i], type.get(sales[i]) + 1);
            } else {
                type.put(sales[i], 1);

            }
        }
        ans.add(type.size());

        for (int i = K; i < sales.length; i++) {
            if (type.containsKey(sales[i])) {
                type.put(sales[i], type.get(sales[i]) + 1);
            } else {
                type.put(sales[i], 1);
            }

            if (type.get(sales[i - K]) > 1) {
                type.put(sales[i - K], type.get(sales[i - K]) - 1);
            } else {
                type.remove(sales[i - K]);

            }


            ans.add(type.size());
        }


        for (int i : ans) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] sales = new int[N];

        for (int i = 0; i < sales.length; i++) {
            sales[i] = in.nextInt();
        }

        SalesType sol = new SalesType();
        sol.solution(sales, K);

    }

}
