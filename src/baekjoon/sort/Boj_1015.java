package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_1015 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        //2 3 1
        //A[0] = 2    ==    B[P[0]] = 2
        //A[1] = 3    ==    B[P[1]] = 3
        //A[2] = 1    ==    B[P[2]] = 1

        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(A, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }

        });

        System.out.println(A);

    }

}
