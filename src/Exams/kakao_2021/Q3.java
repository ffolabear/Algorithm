package Exams.kakao_2021;

import java.util.Stack;

public class Q3 {

    public static void main(String[] args) {


        String[] arr= {"D 2", "C", "U 3", "C", "D 4", "C", "U 2", "Z", "Z", "U 1", "C"};
        solution(8, 2 , arr);

    }


    public static String solution(int n, int k, String[] cmd) {


        StringBuilder answer = new StringBuilder();

        String[] temp = new String[n];

        for (int i = 0; i < n; i++){
            temp[i] = "O";
        }

        System.out.println(answer);


        Stack<Integer> delete = new Stack<>();
        int ptr = k;

        for (int i=0; i < cmd.length; i++){

            int cnt = 0;
            int recent = 0;

            switch (cmd[i].charAt(0)){

                case 'U':
                    System.out.println("U 변경전 : " + ptr);


                    ptr -= cmd[i].charAt(cmd[i].length() - 1) - '0';

                    if ( k < 0){
                        ptr = 0;
                    }

                    System.out.println("U 변경후 : " + ptr);
                    break;

                case 'D':
                    System.out.println("D 변경전 : " + ptr);
                    ptr += cmd[i].charAt(cmd[i].length() - 1) - '0';


                    if (ptr >= n){
                        ptr = n - 1;
                    }

                    System.out.println("D 변경후 : " + ptr);
                    break;

                case 'C':
                    System.out.println("C 변경전 : " + ptr);
                    temp[ptr] = "X";
                    delete.push(ptr);
                    System.out.println(delete.peek());

                    if (ptr == n-1){
                        ptr -= 1;

                    } else {

                        ptr += 1;
                    }

                    System.out.println("C 변경후 : " + ptr);
                    cnt++;
                    break;

                case 'Z':
                    System.out.println("Z 변경전 : " + ptr);
                    recent = delete.pop();
                    temp[recent] = "O";

                    if (recent < ptr){
                        ptr += 1;
                    }

                    System.out.println("Z 변경후 : " + ptr);
                    break;
            }
        }



        for (String str : temp){
            answer.append(str);

        }
        System.out.println(answer);
        return String.valueOf(answer);
    }



}
