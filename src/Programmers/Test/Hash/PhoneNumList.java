package Programmers.Test.Hash;


import java.util.HashMap;

public class PhoneNumList {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> hash = new HashMap<>();

        for (String str : phone_book){
            hash.put(str, 0);
        }

        for (int i = 0; i < phone_book.length; i++) {

            for (int j = 1; j < phone_book[i].length(); j++) {
                if (hash.containsKey(phone_book[i].substring(0, j))){
                    answer = false;
                }

            }

        }


        return answer;
    }

    public static void main(String[] args) {

        String[] nums = {"119", "97674223", "1195524421"};
        PhoneNumList phoneNumList = new PhoneNumList();

        System.out.println(phoneNumList.solution(nums));


    }
}
