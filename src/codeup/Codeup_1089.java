package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1089 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = (bf.readLine()).split(" ");
        int[] arr = new int[str.length];

        for(int i =0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        int cnt = 1;
        int res = arr[0];

        while (cnt < arr[2]){
            res += arr[1];
            cnt++;
        }
        System.out.println(res);

    }
}
