package baekjoon.lecture.bruteforce.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj15658 {

    static int N;
    static int[] operators = new int[4];
    static int[] nums;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //숫자의 갯수
        N = Integer.parseInt(br.readLine());
        System.out.println("N : " + N);

        //입력받은 숫자
        String[] numbers = br.readLine().split(" ");
        nums = new int[numbers.length];



        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        StringTokenizer st = new StringTokenizer(br.readLine());

        operators[0] = Integer.parseInt(st.nextToken());
        operators[1] = Integer.parseInt(st.nextToken());
        operators[2] = Integer.parseInt(st.nextToken());
        operators[3] = Integer.parseInt(st.nextToken());

        System.out.println(operators[0] + " " + operators[1] + " " + operators[2] + " " + operators[3]);



    }

}
