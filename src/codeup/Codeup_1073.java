package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1073 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] arr = str.split(" ");

        for(int i =0; i < arr.length; i++){
            if(Integer.parseInt(arr[i]) != 0){
                System.out.println(arr[i]);
            } else {
                break;
            }
        }


    }
}
