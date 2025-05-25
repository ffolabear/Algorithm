package codetree.noviceMid;

import java.util.Scanner;

public class MakingRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();

        for(int j=0;j<rowNum;j++){
            for(int k=0;k<colNum;k++){
                System.out.print('1');
            }
            System.out.println();
        }


    }

}
