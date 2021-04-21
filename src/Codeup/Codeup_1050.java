package Codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeup_1050 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i = 0; i < st.countTokens(); i++){

            int val = Integer.parseInt(st.nextToken());

            if( val == Integer.parseInt(st.nextToken())){

                System.out.println("1");

            } else {
                System.out.println("0");
            }

        }

    }

}
