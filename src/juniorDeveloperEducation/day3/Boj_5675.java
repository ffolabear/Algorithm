package juniorDeveloperEducation.day3;

import java.util.Scanner;

public class Boj_5675 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        while (sc.hasNext()) {
            int time = sc.nextInt();
            sb.append(isValid(time)).append('\n');
        }

        System.out.println(sb.toString());
    }

    private static String isValid(int time) {

        String ans = "N";

        if (time % 6 == 0) {
            ans = "Y";
        }

        return ans;
    }

}
