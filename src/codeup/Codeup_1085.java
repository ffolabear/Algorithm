package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1085 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        double[] arr = new double[str.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        double ans = arr[0] * arr[1] * arr[2] * arr[3];
        double res = ans / ((double)(8 * 1024 * 1024));
        System.out.printf("%.1f MB",res);


    }
}
