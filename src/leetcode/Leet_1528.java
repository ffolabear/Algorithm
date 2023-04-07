package leetcode;

public class Leet_1528 {

    public String restoreString(String s, int[] indices) {

        char[] arr = new char[s.length()];

        for (int i = 0; i < indices.length; i++) {
            int current = indices[i];
            arr[current] = s.charAt(i);
        }

        String ans = String.valueOf(arr);
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {

        //c o d e l e e t
        //0 1 2 3 4 5 6 7
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        Leet_1528 sol = new Leet_1528();
        sol.restoreString(s, indices);

    }

}
