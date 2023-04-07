package leetcode;


public class Leet_1784 {

    public boolean checkOnesSegment(String s) {

        boolean isSegment = true;
        int cntOne = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cntOne++;
            }
        }

        if (cntOne == 1) {
            return true;
        } else {

            for (int i = 1; i < s.length(); i++) {

                if (s.charAt(i) == '1') {

                    if (isSegment) {
                        if (s.charAt(i - 1) == '1') {
                            isSegment = true;
                        } else {
                            isSegment = false;
                        }
                    } else {
                        return false;
                    }

                }

            }
        }


        return isSegment;
    }

    public static void main(String[] args) {

        String s = "1100111";
        Leet_1784 sol = new Leet_1784();

        sol.checkOnesSegment(s);
//        System.out.println(sol.checkOnesSegment(s));

    }

}
