package leetcode;

public class Leet_0383 {

    public static void main(String[] args) {

        String ransomNote = "ax";
        String magazine = "acab";

        int[] arr = new int[26];
        for(char c : magazine.toCharArray()){
            arr[c-'a'] = arr[c-'a'] + 1;
            System.out.println(arr[c-'a']);
        }

        for(char c : ransomNote.toCharArray()){

            if(arr[c - 'a'] > 0){
                arr[c - 'a']--;
            } else {
                System.out.println(false);
            }
        }

        System.out.println(true);

    }


}
