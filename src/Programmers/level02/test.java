package Programmers.level02;

import java.util.*;
class test {
    ArrayList<Integer> result;
    boolean[] visited;

    public int solution(String numbers) {

        result = new ArrayList<Integer>();
        visited = new boolean[numbers.length()];
        int[] nums = new int[numbers.length()];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numbers.charAt(i)+"");
        }

        //자리 수 마다 해당 배열을 perm 메서드에 보낸다.
        for(int i = 1; i <= numbers.length(); i++) {
            int[] resultArr = new int[i];
            perm(nums, resultArr, nums.length, i, 0);
        }

        return result.size();

    }
    public boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        if(num == 2 || num == 3) {
            return true;
        }

        int end = (int) Math.sqrt(num);
        for(int i = 2; i <= end; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public void perm(int[] nums, int[] resultArr, int n, int r, int index) {
        if(index == r) {
            String realNum = "";
            for(int i = 0; i < resultArr.length; i++) {
                realNum += resultArr[i];
            }

            int num = Integer.parseInt(realNum);
            if(isPrime(num)) {
                if(!result.contains(num)) {
                    result.add(num);
                }
            }
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                resultArr[index] = nums[i];
                perm(nums, resultArr, n, r, index+1);
                resultArr[index] = 0;
                visited[i] = false;
            }
        }
    }

}