package Boostcamp;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {

        String[] arr = {"/a/a_v2/x", "/b/a.x", "/c/t.z", "/e/z/t_v1.z"};
        solution(arr);


    }

    public static String[] solution(String[] param){

        String[] answer = {};
        String[][] covt = new String[param.length][];

        for (int i=0; i < param.length; i++){
            System.out.println(param[i]);
            covt[i] = param[i].split("/");
        }


        for (int i = 0 ; i < covt.length; i++){
            String temp = covt[i][covt[i].length -1];
//            String[] tempArr = temp.split(".");
            System.out.println(temp.charAt(0));
            System.out.println(temp.indexOf("."));
        }

        return answer;
    }

}
