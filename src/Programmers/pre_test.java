package Programmers;

import java.util.ArrayList;

public class pre_test {

    public static int[] solution(int[] answers) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for(int i=0; i < answers.length; i++){

            if(answers[i] == a[i%a.length]) {
                score[0]++;
            }

            if(answers[i] == b[i%b.length]) {
                score[1]++;
            }

            if(answers[i] == c[i%c.length]) {
                score[2]++;
            }

        }

        System.out.println("1 : " + score[0]);
        System.out.println("2 : " + score[1]);
        System.out.println("3 : " + score[2]);

        int max = Math.max(Math.max(score[0],score[1]), score[2]);
        System.out.println(max);



        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == score[0]){
            list.add(1);
        }

        if(max == score[1]){
            list.add(2);
        }

        if(max == score[2]){
            list.add(3);
        }

        System.out.println(list.size());

        int[] answer = new int[list.size()];
        for(int i=0; i < answer.length; i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }


    public static void main(String[] args) {

        int answer[] = {1,2,3,3,2,4};
        solution(answer);
    }
}
