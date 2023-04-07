package programmers.level01;

public class collatz {

    public static int solution(int num) {

        int answer = 0;

       while (answer != 500){

           if (num == 1){
               break;
           }

           answer ++;


           if (num%2 == 0){
               num /= 2;
           } else if (num%2 == 1){
               num = num * 3 + 1;
           }



       }

        if (num != 1 && answer == 500){
            answer= -1;
        }

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {

        int n = 16;
        solution(n);


    }
}
