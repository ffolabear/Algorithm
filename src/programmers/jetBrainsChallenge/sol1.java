package programmers.jetBrainsChallenge;

public class sol1 {

    public int solution(int[] numbers) {
        int answer = -1;

        int value = 45;

        for (int i = 0; i < numbers.length; i++) {
            value -= numbers[i];
        }

        answer = value;
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        sol1 sol = new sol1();
        int[] number = {1, 2, 3, 4, 6, 7, 8, 0};
        sol.solution(number);

    }

}
