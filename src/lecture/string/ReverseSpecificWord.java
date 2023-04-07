package lecture.string;

import java.util.Scanner;

public class ReverseSpecificWord {

    private String solution(String word) {

        String regex = "[a-zA-Z]";
        String[] arr = word.split("");
        StringBuilder sb = new StringBuilder();

        int lt = 0;
        int rt = word.length() - 1;

        while (lt < rt) {
            String left = arr[lt];
            String right = arr[rt];

            //혹은 정규식을 사용하지 않고 char 배열로 만든다음 Character.isAlphabetic 메서드도 사용가능
            if (!left.matches(regex)) {
                lt++;
            } else if (!right.matches(regex)) {
                rt--;
            } else {
                arr[lt] = right;
                arr[rt] = left;
                lt++;
                rt--;
            }
        }

        for (String s : arr) {
            sb.append(s);
        }
        System.out.println(sb);

        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();

        ReverseSpecificWord sol = new ReverseSpecificWord();
        sol.solution(word);

    }

}
