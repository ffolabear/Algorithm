package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1094 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        String[] arr = (bf.readLine().split(" "));
        int[] nums = new int[N];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        int ptr = nums[0];
        for(int j =0; j < nums.length-1; j++){
            if(ptr > nums[j+1]){
                ptr = nums[j+1];
            }

        }

        System.out.println(ptr);

    }
}
