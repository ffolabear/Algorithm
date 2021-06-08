package Programmers.Test;

public class test {

    public static void main(String[] args) {

        String str = "aabbcc";

        String aws = str.replaceAll("hello", "hi");

        for (int i=2; i <= str.length()/2; i++){

            System.out.println(str.substring(0,i));
        }



        //System.out.println(str.substring(0,2));

    }
}
