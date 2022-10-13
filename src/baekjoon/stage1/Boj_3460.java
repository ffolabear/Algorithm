package baekjoon.stage1;

import java.util.Scanner;

public class Boj_3460 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int j = 0; j < testcase; j ++){
            int n = sc.nextInt();
            String covt = Integer.toBinaryString(n);
            for (int i = covt.length() - 1 ; i >= 0 ; i--){
                if (covt.charAt(i) == '1'){
                    System.out.print(Math.abs(i - covt.length()) - 1 + " ");
                }
            }


        }




    }


}
