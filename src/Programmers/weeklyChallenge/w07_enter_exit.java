package Programmers.weeklyChallenge;

import java.util.LinkedList;
import java.util.Queue;

public class w07_enter_exit {

    //아이디어 : 들어온 순서보다 나간 순서가 더 중요하다

    public int[] solution(int[] enter, int[] leave) {

        Queue<Integer> people = new LinkedList<>();

        for (int i = 0; i < enter.length; i++) {
            people.offer(enter[i]);
        }


        System.out.println(people);


        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {

        int[] enter = {1, 3, 2};
        int[] leave = {1, 2, 3};

//        int[] enter = {1,4,2,3};
//        int[] leave = {2,1,3,4};

//        int[] enter = {3,2,1};
//        int[] leave = {2,1,3};

//        int[] enter = {3,2,1};
//        int[] leave = {1,3,2};

//        int[] enter = {1,4,2,3};
//        int[] leave = {2,1,4,3};


        w07_enter_exit sol = new w07_enter_exit();
        sol.solution(enter, leave);

    }
}
