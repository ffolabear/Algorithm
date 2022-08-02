package Leetcode;

public class Leet_1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }

        System.out.println(sb1 + " " + sb2  );

        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Leet_1662 sol = new Leet_1662();
        String[] word1 = {"a", "cb"};
        String[] word2 = {"ab", "c"};

        sol.arrayStringsAreEqual(word1, word2);

    }

}
