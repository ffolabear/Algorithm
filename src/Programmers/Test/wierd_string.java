package Programmers.Test;

public class wierd_string {

    public static String solution(String s) {

        String answer = "";
        char[] cha = s.toCharArray();

        int cnt = 0;

        for (int i = 0; i < cha.length; i++){

            if( cha[i] == ' '){
                cnt = 0;
                answer += " ";
                continue;
            } else {

                if(cnt % 2 == 0){

                    answer += Character.toUpperCase(cha[i]);
                    cnt ++;

                } else {

                    answer += Character.toLowerCase(cha[i]);
                    cnt ++;
                }


            }



        }


        System.out.println(answer);

        return answer;

    }

    public static void main(String[] args) {

        String s = "try hello world";
        solution(s);
    }

}
