package Programmers.level02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class SortingFileName {

    public String[] solution(String[] files) {

        String[][] divide = new String[files.length][3];


        for (int i = 0; i < files.length; i++) {
            files[i] = files[i].toLowerCase(Locale.ROOT);

            int headIdx = 0;

            for (int j = 0; j < files[i].length(); j++) {
                if (files[i].charAt(j) >= 48 && files[i].charAt(j) <= 57) {
                    divide[i][0] = files[i].substring(0, j);
                    headIdx = j;

                    int numIdx = 0;

                    for (int k = headIdx; k < files[i].length(); k++) {

                        if (String.valueOf(files[i].charAt(k)).matches("[0-9]")) {
                            numIdx = k;
                        } else {
                            divide[i][1] = files[i].substring(headIdx, numIdx += 1);
                            break;

                        }

                    }

                    divide[i][2] = files[i].substring(numIdx + 1);

                    break;

                }


            }


        }

        for (int i = 0; i < divide.length; i++) {
            for (int j = 0; j < divide[i].length; j++) {

                System.out.print(divide[i][j] + " ");

            }
            System.out.println();
        }


        Arrays.sort(files, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return 0;
            }

        });


        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {

        String[] files = {

                "img12.png",
                "img10.png",
                "img02.png",
                "img1.png",
                "IMG01.GIF",
                "img2.JPG"

        };

//        String[] files = {
//
//                "F-5 Freedom Fighter",
//                "B-50 Superfortress",
//                "A-10 Thunderbolt II",
//                "F-14 Tomcat"
//
//        };


        // 출력 예졔
        // {  "img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"}

        SortingFileName sol = new SortingFileName();
        sol.solution(files);

    }

}
