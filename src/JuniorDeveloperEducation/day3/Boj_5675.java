package JuniorDeveloperEducation.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_5675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        while (true) {
            input = br.readLine();
            int time = Integer.parseInt(input);
            System.out.println(isValid(time));
        }
    }

    private static String isValid(int time) {

        int degree = 0;
        String ans = "N";

        int hour = 0;
        int min = 0;

        while (hour < 13) {

            if (degree == time) {
                ans = "Y";
                break;
            }

            if (min > 360) {
                min = min - 360;
            }

            degree = Math.abs(min - hour);

            hour += 1;
            min += 12;
        }


        return ans;
    }

}
