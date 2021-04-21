package Programmers.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dividable {

    public static List<Integer> solution(int[] arr, int divisor) {

        List<Integer> list = new ArrayList<>();

        for (int i=0; i < arr.length; i++){

            if(arr[i]% divisor ==0){

                list.add(arr[i]);

            }
        }

        if (list.size() == 0){
            list.add(-1);
        }


        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        solution(arr, divisor);

    }
}
