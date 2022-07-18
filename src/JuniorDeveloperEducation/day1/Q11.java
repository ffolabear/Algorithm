package JuniorDeveloperEducation.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11 {

    static int current = 2;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        while (current < 31) {
            player();
            computer();
        }
    }

    private static void player() {

        String nums = sc.next();
        String[] input = nums.split(" ");
        int len = input.length;
        System.out.println(nums);

        current = Integer.parseInt(input[len - 1]);
    }

    private static void computer() {
        while (current % 4 == 2) {
            current++;
        }
    }

}
