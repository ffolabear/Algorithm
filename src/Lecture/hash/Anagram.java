package Lecture.hash;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

    private void solution(String str1, String str2) {

        HashMap<Character, Integer> str1Map = new HashMap<>();

        for (char c : str1.toCharArray()) {
            str1Map.put(c, str1Map.getOrDefault(c, 0) + 1);
        }


        HashMap<Character, Integer> str2Map = new HashMap<>();

        for (char c : str2.toCharArray()) {
            str2Map.put(c, str2Map.getOrDefault(c, 0) + 1);
        }

        boolean isValid = false;

        for (char c : str1Map.keySet()) {
            if (str2Map.containsKey(c)) {
//                if (str1Map.get(c).equals(str2Map.get(c))) {
                if (str1Map.get(c) == str2Map.get(c)) {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            } else {
                isValid = false;
                break;
            }
        }


        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();

        System.out.println(str1.toUpperCase(Locale.ROOT));
        System.out.println(str2.toUpperCase(Locale.ROOT));

        Anagram sol = new Anagram();
        sol.solution(str1, str2);


    }


}
