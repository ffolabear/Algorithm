package swexpert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw_1218 {

    public static void main(String[] args) throws FileNotFoundException {

        System.setIn(new FileInputStream("src/swexpert/input_1218.txt"));
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {


            int length = sc.nextInt();
            String input = sc.next();

            System.out.print("#" + i + " " + isValid(input, length) + "\n");


        }
    }

    static int isValid(String input, int length) {

        //(
        int bracketA = 0;
        //{
        int bracketB = 0;
        //[
        int bracketC = 0;
        //<
        int bracketD = 0;

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '(':
                    bracketA++;
                    break;
                case ')':
                    bracketA--;
                    break;
                case '{':
                    bracketB++;
                    break;
                case '}':
                    bracketB--;
                    break;
                case '[':
                    bracketC++;
                    break;
                case ']':
                    bracketC--;
                    break;
                case '<':
                    bracketD++;
                    break;
                case '>':
                    bracketD--;
                    break;
            }
        }
        if (bracketA == 0 && bracketB == 0 && bracketC == 0 && bracketD == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
