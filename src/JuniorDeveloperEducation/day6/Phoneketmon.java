package JuniorDeveloperEducation.day6;

import java.util.HashMap;

public class Phoneketmon {

    public int solution(int[] nums) {

        int answer = 0;
        int len = nums.length / 2;

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], "0");
        }

        if (len >= map.size()) {
            answer = map.size();
        } else {
            answer = len;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {3,1,2,3};
//        int[] nums = {3,3,3,2,2,4};
//        int[] nums = {3,3,3,2,2,2};

        Phoneketmon sol = new Phoneketmon();
        sol.solution(nums);

    }

}
