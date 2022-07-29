package JuniorDeveloperEducation.day8;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        String[] str = {"eat", "tea", "ate", "tan", "nat", "bat"};

        Map<String, ArrayList<Integer>> map = new HashMap<>();


        for (int i = 0; i < str.length; i++) {

            char[] temp = str[i].toCharArray();
            Arrays.sort(temp);
            StringBuilder sb = new StringBuilder(String.valueOf(temp));
            String key = sb.toString();

            if (map.containsKey(key)) {
                map.get(key).add(i);

            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(key, list);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (String keys : map.keySet()) {

            ArrayList<String> list = new ArrayList<>();
            ArrayList<Integer> current = map.get(keys);

            for (int i = 0; i < current.size(); i++) {
                int index = current.get(i);
                list.add(str[index]);
            }
            ans.add(list);
        }

        System.out.println(map);
        System.out.println("--------------------");
        System.out.println(ans);


    }

}
