package JuniorDeveloperEducation.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersAndWords {

    public int solution(String s) {

        int answer = 0;

        s = s.replaceAll("(one)", "1");
        s = s.replaceAll("(two)", "2");
        s = s.replaceAll("(three)", "3");
        s = s.replaceAll("(four)", "4");
        s = s.replaceAll("(five)", "5");

        s = s.replaceAll("(six)", "6");
        s = s.replaceAll("(seven)", "7");
        s = s.replaceAll("(eight)", "8");
        s = s.replaceAll("(nine)", "9");
        s = s.replaceAll("(zero)", "0");

        System.out.println("s = " + s);
//        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        NumbersAndWords sol = new NumbersAndWords();
        sol.solution(s);



    }

}
