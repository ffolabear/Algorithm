package Programmers.level02;

import java.util.Locale;

public class SortingFileName {

    public String[] solution(String[] files) {

        String[][] divide = new String[files.length][3];


        for (int i = 0; i < files.length; i++) {
            files[i] = files[i].toLowerCase(Locale.ROOT);

            for (int j = 0; j < files[i].length(); j++) {
                if (files[i].charAt(j) >= 48 && files[i].charAt(j) <= 57) {
                    divide[i][0] = files[i].substring(0, j);
                    System.out.println("HEAD : " + divide[i][0]);

                    System.out.println(files[i].charAt(j));
                    for (int k = j; k < files[i].length(); k++) {

                        if (files[i].charAt(k) < 48 && files[i].charAt(k) > 57) {

                            divide[i][1] = files[i].substring(j, k);
                            System.out.println("NUMBER : " + divide[i][1]);
                            break;
                        }
                    }
                }





            }

        }




        String[] answer = {};
        return answer;
    }

    public static void main(String[] args) {

//        String[] files = {
//
//                "img12.png",
//                "img10.png",
//                "img02.png",
//                "img1.png",
//                "IMG01.GIF",
//                "img2.JPG"
//
//        };

        String[] files = {

                "F-5 Freedom Fighter",
                "B-50 Superfortress",
                "A-10 Thunderbolt II",
                "F-14 Tomcat"

        };


        // 출력 예졔
        // {  "img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"}

        SortingFileName sol = new SortingFileName();
        sol.solution(files);

    }

}
