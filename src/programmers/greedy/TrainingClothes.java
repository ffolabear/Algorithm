package programmers.greedy;

public class TrainingClothes {

    public int solution(int n, int[] lost, int[] reserve) {

        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {



            }
        }

        return answer;
    }

    public static void main(String[] args) {

//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        TrainingClothes sol = new TrainingClothes();
        sol.solution(n, lost, reserve);


    }

}
