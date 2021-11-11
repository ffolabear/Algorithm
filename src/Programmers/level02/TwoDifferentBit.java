package Programmers.level02;

public class TwoDifferentBit {

    public long[] solution(long[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Long.toBinaryString(numbers[i]));
            String str = Long.toBinaryString(numbers[i]);
        }

        long[] answer = {};


        return answer;
    }

    public static void main(String[] args) {

        long[] numbers = {2, 7};
        TwoDifferentBit sol = new TwoDifferentBit();
        sol.solution(numbers);

    }
}
