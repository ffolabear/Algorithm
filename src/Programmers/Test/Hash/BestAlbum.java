package Programmers.Test.Hash;

import java.util.*;

public class BestAlbum {

    public ArrayList<Integer> solution(String[] genres, int[] plays) {

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> hash = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            hash.put(genres[i], hash.getOrDefault(genres[i], 0) + plays[i]);

        }


        List<String> keys = new ArrayList<>(hash.keySet());
        keys.sort((o1, o2) -> (hash.get(o2).compareTo(hash.get(o1))));

        for (int i = 0; i < keys.size(); i++) {

            String tempGenre = keys.get(i);

            int first = 0;
            int second = 0;

            int ptr = 0;

            for (int j = 0; j < genres.length; j++) {
                //hash에 있는 장르에 해당하는 값일때
                if (genres[j].equals(tempGenre)) {
                    //최댓값 구하기
                    if (plays[j] > ptr) {
                        ptr = plays[j];
                        first = j;
                    }
                }
            }

            ptr = -1;
            for (int k = 0; k < genres.length; k++) {
                //hash에 있는 장르에 해당하는 값일때
                if (genres[k].equals(tempGenre)) {
                    //first 다음으로 큰 최댓값
                    if (k != first && plays[k] > ptr) {
                        ptr = plays[k];
                        second = k;
                    }
                }
            }
            answer.add(first);

            if (ptr != -1) {
                answer.add(second);
            }



        }


        System.out.println(hash);

        return answer;
    }

    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        BestAlbum bestAlbum = new BestAlbum();
        bestAlbum.solution(genres, plays);

    }
}
