package Programmers.level02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class SortingFileName {

    public String[] solution(String[] files) {

        String[][] divide = new String[files.length][3];


        for (int i = 0; i < files.length; i++) {

            divide(files[i]);

        }

        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                String[] str1 = divide(o1);
                String[] str2 = divide(o2);

                int headCompare = str1[0].compareTo(str2[0]);

                if (headCompare == 0) {
                    int numCompare = Integer.parseInt(str1[1]) - Integer.parseInt(str2[1]);
                    return numCompare;

                } else {
                    return headCompare;
                }
            }
        });


        return files;
    }

    static String[] divide(String file) {

        String head = "";
        String number = "";
        String remain = "";


        file = file.toLowerCase(Locale.ROOT);

        int headIdx = 0;

        for (int j = 0; j < file.length(); j++) {
            if (file.charAt(j) >= 48 && file.charAt(j) <= 57) {
                head = file.substring(0, j);
                headIdx = j;

                int numIdx = 0;

                for (int k = headIdx; k < file.length(); k++) {

                    if (String.valueOf(file.charAt(k)).matches("[0-9]")) {
                        numIdx = k;
                    } else {
                        number = file.substring(headIdx, numIdx += 1);
                        break;
                    }
                }

                remain = file.substring(numIdx + 1);

                break;

            }


        }


        String[] res = {head, number, remain};

        return res;
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
