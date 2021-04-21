package Codeup;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1079 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = (bf.readLine()).split(" ");

        char c = 'q';

        for (int i =0; i < arr.length; i++){

            if(!arr[i].equals("q")){
                System.out.println(arr[i]);
            } else if(arr[i].equals("q"))  {
                System.out.println(arr[i]);
                break;
            }
        }

    }
}
