package Codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1093 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        String[] arr = (bf.readLine().split(" "));
        int[] nums = new int[N];
        int[] compare = new int[24];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
            compare[nums[i]]++;
        }

        for (int j = 1; j < compare.length; j++){
            System.out.print(compare[j] + " ");
        }

    }
}
