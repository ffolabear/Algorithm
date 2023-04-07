package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Codeup_1090 {

    public static void main(String[] args) throws IOException, IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = (bf.readLine()).split(" ");
        int[] arr = new int[str.length];

        for(int i =0 ; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        double res = arr[0];

        for (int i=1; i <= arr[2]; i++){



            if (i == arr[2]){
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println(df.format(res));
            }
            res *= arr[1];
        }

    }
}
