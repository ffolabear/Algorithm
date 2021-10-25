package Programmers.level02;

public class PressingKeypad {

    public String solution(int[] numbers, String hand) {

        StringBuilder sb = new StringBuilder();

        int lastLeft = -1;
        int lastRight = -2;

        for (int i = 0; i < numbers.length; i++) {

        }

        int[][] keypad = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9},
                          {-1,0, -2}};


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                lastLeft = numbers[i];

            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){
                sb.append("R");
                lastRight = numbers[i];

            } else {

                int targetRow = 0;
                int targetCol = 0;

                int leftRow = 3;
                int leftCol = 0;

                int rightRow = 3;
                int rightCol = 2;

                for (int j = 0; j < keypad.length; j++) {
                    for (int k = 0; k < keypad[j].length; k++) {
                        if (keypad[j][k] == numbers[i]) {
                            targetRow = j;
                            targetCol = k;
                        }

                        if (keypad[j][k] == lastLeft) {

                            leftRow = j;
                            leftCol = k;
                        }

                        if (keypad[j][k] == lastRight) {

                            rightRow = j;
                            rightCol = k;
                        }

                    }
                }

                System.out.println(targetRow + " - " + targetCol + " | " + leftCol + " - " + leftRow + " | " + rightCol + " - " + rightRow);

                int leftRes = Math.abs(targetCol - leftCol) + Math.abs(targetRow - leftRow);
                int rightRes = Math.abs(targetCol - rightCol) + Math.abs(targetRow - rightRow);

                System.out.println(leftRes);
                System.out.println(rightRes);

                //오른손에서 가는 거리가 더 가까움
                if (leftRes > rightRes) {
                    sb.append("R");
                    lastRight = numbers[i];

                //왼손에서 가는 거리가 더 가까움
                } else if(leftRes < rightRes){
                    sb.append("L");
                    lastLeft = numbers[i];
                } else {
                    if (hand.equals("right")){
                        sb.append("R");
                        lastRight = numbers[i];
                    } else {
                        sb.append("L");
                        lastLeft = numbers[i];
                    }
                }

            }

            System.out.println("마지막 왼손 위치 : " + lastLeft);
            System.out.println("마지막 오른손 위치 : " + lastRight);
            System.out.println("------------------------------------------------");
        }

        //내답 : LRLLLRLLLRR
        //      LRLLRRLLLRR
        //정답 : LRLLRRLLLRR

        String answer = sb.toString();
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String hand = "right";

        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        PressingKeypad sol = new PressingKeypad();
        sol.solution(numbers, hand);

    }

}
