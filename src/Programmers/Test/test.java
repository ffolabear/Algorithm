package Programmers.Test;

import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {

        String s = "ffffPfff";

        for(int i=0; i < s.length(); i++){
            System.out.println(i);
            if(String.valueOf(s.charAt(i)).equals("f")){

                System.out.println("true");
            }
        }
    }

}
