package Programmers.Hash;


import java.util.HashMap;

public class PhoneNumList2 {

    public boolean solution(String[] phone_book) {

        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], 0);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                String temp = phone_book[i].substring(0, j);
                if (map.containsKey(temp)) {
                    answer = false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] nums = {"119", "97674223", "1195524421"};
        PhoneNumList2 phoneNumList = new PhoneNumList2();

        System.out.println(phoneNumList.solution(nums));


    }
}
