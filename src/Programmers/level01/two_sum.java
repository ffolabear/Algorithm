package Programmers.level01;

import java.util.*;

public class two_sum {

    public static List solution(int[] numbers) {

        Set<Integer> sum = new HashSet();

        for(int i=0; i < numbers.length; i++){

            for (int j=0; j < numbers.length; j++){

                if(j == i){
                    continue;
                }

                sum.add(numbers[i] + numbers[j]);


            }

        }

        Iterator<Integer> iter = sum.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        List convt = new ArrayList<>(sum);
        Collections.sort(convt);


        return convt;

    }


    public static void main(String[] args) {

        int [] arr = {5,0,2,7};

        solution(arr);

    }

}
