package Exams.woowacourse4th;

public class Sol7 {

    public String[] solution(String[] grid, boolean clockwise) {

        String[] answer = new String[grid.length];

        if (clockwise) {
            answer[0] = String.valueOf(grid[grid.length - 1].charAt(0));

            StringBuilder sb = new StringBuilder();


        } else {
            answer[0] = String.valueOf(grid[grid.length - 1].charAt(grid[grid.length - 1].length() - 1));
        }

        for (int i = 0; i < grid.length; i++) {




        }

        System.out.println(answer[0]);

        return answer;
    }

    public static void main(String[] args) {
        String[] grid = {"1", "234", "56789"};
        boolean clockwise = false;

        Sol7 sol = new Sol7();
        sol.solution(grid, clockwise);

    }
}
