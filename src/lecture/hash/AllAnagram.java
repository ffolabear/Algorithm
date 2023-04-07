package lecture.hash;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {

    private int solution(String S, String T) {

        HashMap<Character, Integer> target = new HashMap<>();
        int ans = 0;

        //Anagram 타겟
        for (char c : T.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }

        int len = T.length();
        char[] sArr = S.toCharArray();

        HashMap<Character, Integer> window = new HashMap<>();


        //Sliding window 첫방문-----------------------------
        for (int i = 0; i < T.length(); i++) {
            window.put(sArr[i], window.getOrDefault(sArr[i], 0) + 1);
        }

        if (target.keySet().equals(window.keySet())) {
            ans++;
        }

        //------------------------------------------------

        for (int i = len; i < S.length(); i++) {

            //앞항은 뺴고
            if (window.containsKey(sArr[i - len])) {
                if (window.get(sArr[i - len]) == 1) {
                    window.remove(sArr[i - len]);
                } else {
                    window.put(sArr[i - len], window.get(sArr[i - len]) - 1);
                }
            } else {
                window.remove(sArr[i - len]);
            }

            //뒷항은 더하고
            window.put(sArr[i], window.getOrDefault(sArr[i], 0) + 1);

            if (window.keySet().equals(target.keySet())) {
                boolean isValid = false;
                for (Character C : window.keySet()) {
                    if (window.get(C).equals(target.get(C))) {
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    ans++;
                }

            }

        }

        return ans;
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String S = in.next();
        String T = in.next();

        AllAnagram sol = new AllAnagram();
        System.out.println(sol.solution(S, T));

    }

}
