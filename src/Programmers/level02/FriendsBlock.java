package Programmers.level02;

public class FriendsBlock {

    static String[][] block;

    public int solution(int m, int n, String[] board) {

        block = new String[board.length][];

        for (int i = 0; i < board.length; i++) {
            block[i] = board[i].split("");
        }

        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < block[i].length; j++) {
                System.out.print(block[i][j] + " ");
            }
            System.out.println();
        }

        int answer = 0;


        for (int i = 0; i < block.length; i++) {
            for (int j = 0; j < block[i].length; j++) {
                check(i, j);
            }
        }


        return answer;
    }

    static void check(int m, int n) {

        boolean[][] squareChk = new boolean[m][n];

        for (int i = 1; i < m; i++) {
            boolean isSquare = false;
            for (int j = 1; j < n; j++) {

                String current = block[i][j];

                if (block[i - 1][j - 1].equals(current) && block[i - 1][j].equals(current) && block[i][j - 1].equals(current)) {

                    squareChk[i - 1][j - 1] = true;
                    squareChk[i][j - 1] = true;
                    squareChk[i - 1][j] = true;
                    squareChk[i][j] = true;

                    isSquare = true;

                }


            }

            if (isSquare) {
                System.out.println("사각형 " + m + " " + n);
            }
        }


    }


    public static void main(String[] args) {

        int m = 4;
        int n = 5;
        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};

        FriendsBlock sol = new FriendsBlock();
        sol.solution(m, n, board);


    }
}
