package Programmers.level02_1;

public class Tuple2 {

    public String[] solution(String s) {

        String[] answer = {};

        String regex = "[{]";
        String covt = s.replaceAll(regex, "");
        String[] nums = covt.split("}");

        String[][] strArr = new String[nums.length][];

        int maxLength = nums[0].length();


        for (int i = 0; i < nums.length; i++) {
            maxLength = Math.max(maxLength, nums[i].length());
        }

        String longest = "";

        for (int i = 0; i < nums.length; i++) {
            if (nums[i].length() == maxLength) {
                longest = nums[i];

            }
        }

        longest = longest.substring(1, longest.length());
        System.out.println(longest);

        answer = longest.split(",");


        return answer;
    }

    public static void main(String[] args) {

        Tuple2 sol = new Tuple2();
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        sol.solution(s);

    }

}
