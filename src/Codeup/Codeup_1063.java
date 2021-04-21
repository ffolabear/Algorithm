package Codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1063 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] strarr = str.split(" ");

        int[] arr = new int[2];

        for(int i = 0; i < arr.length; i++){

            arr[i] = Integer.parseInt(strarr[i]);

        }

        System.out.println(arr[0] > arr[1] ? arr[0]:arr[1]);
    }
}
