package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2941 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String croatia = bf.readLine();

        int charCount = 0;


        for (int i = 0; i < croatia.length(); i++) {

            if (croatia.charAt(i) == 'c') {
                if (i < croatia.length() - 1) {
                    if (croatia.charAt(i + 1) == '=') {
                        i++;

                    } else if (croatia.charAt(i + 1) == '-') {
                        i++;
                    }

                }

            } else if (croatia.charAt(i) == 's') {

                if (i < croatia.length() - 1) {
                    if (croatia.charAt(i + 1) == '=') {
                        i++;
                    }

                }


            } else if (croatia.charAt(i) == 'd') {

                if (i < croatia.length() - 1) {
                    if (croatia.charAt(i + 1) == '-') {
                        i++;
                    } else if (croatia.charAt(i + 1) == 'z') {

                        if (i < croatia.length() - 2) {
                            if (croatia.charAt(i + 2) == '=') {
                                i += 2;
                            }

                        }

                    }

                }


            } else if (croatia.charAt(i) == 'l') {
                if (i < croatia.length() - 1) {
                    if (croatia.charAt(i + 1) == 'j') {
                        i++;
                    }

                }

            } else if (croatia.charAt(i) == 'n') {
                if (i < croatia.length() - 1) {
                    if (croatia.charAt(i + 1) == 'j') {
                        i++;
                    }

                }


            } else if (croatia.charAt(i) == 'z') {
                if (i < croatia.length() - 1) {
                    if (croatia.charAt(i + 1) == '=') {
                        i++;
                    }

                }


            }

            charCount++;
        }

        System.out.println(charCount);

    }
}
