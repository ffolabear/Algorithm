package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class budget {

    public static int solution(int[] d, int budget) {

        List<Integer> list = new ArrayList<>();

        for(int i=0; i < d.length; i++){
            list.add(d[i]);
        }

        Collections.sort(list);
        int answer = 0;

        for (int i=0; i < list.size(); i ++){



            if (budget < list.get(i)){
                break;
            }
            budget -= list.get(i);
            answer ++;
        }

        System.out.println(answer);
        return answer;
    }
    


    public static void main(String[] args) {

        int budget = 9;
        int[] d = {1,3,2,5,4};
        solution(d, budget);
        
    }
}
