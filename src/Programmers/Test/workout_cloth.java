package Programmers.Test;

public class workout_cloth {

    public static int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;


        for(int i =0; i < lost.length; i++){

            for(int j=0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }

            }
        }



        for(int i =0; i < lost.length; i++){

            for(int j=0; j < reserve.length; j++){


                if(lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1){

                    reserve[j] = -1;
                    answer++;
                    break;
                }

            }

        }

        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {

        int n = 7;
        int[] lost = {1, 2, 3, 4, 5, 6, 7};
        int[] reserve = {1, 2, 3};

        solution(n, lost, reserve);

    }

}
