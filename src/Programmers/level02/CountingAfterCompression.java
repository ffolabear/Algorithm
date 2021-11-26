package Programmers.level02;

public class CountingAfterCompression {

    public int[] solution(int[][] arr) {

        int length = arr.length;

        while (length > 1) {
            compression(length /= 2, arr);
        }

        int[] answer = {};
        return answer;
    }

    static void compression(int length, int[][] arr) {
        System.out.println("Called");
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 1, 0, 0},
                       {1, 0, 0, 0},
                       {1, 0, 0, 1},
                       {1, 1, 1, 1}};

        CountingAfterCompression sol = new CountingAfterCompression();
        sol.solution(arr);

    }

}
