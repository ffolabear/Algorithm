package Codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1092 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int[] arr = new int[str.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int[] aws = new int[(arr[0] * arr[1] * arr[2]) + 1];

        for (int i = 1; i < aws.length; i++) {

            if (i % arr[0] == 0 && i % arr[1] == 0 && i % arr[2] == 0) {
                System.out.println(i);
                break;
            }
        }




    }

}
