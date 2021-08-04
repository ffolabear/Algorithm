package baekjoon.io;

import java.util.Scanner;

public class Baek_2588 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int a1 = a/100; 
        int a2 = (a - a1 * 100)/10;
        int a3 = a - a1 * 100 - a2*10;
        
        int b1 = b/100; 
        int b2 = (b - b1 * 100)/10;
        int b3 = b - b1 * 100 - b2*10;
        
        int aws1 = a * b3; 
        int aws2 = a * b2;
        int aws3 = a * b1;
        int aws4 = a * b;
        
        System.out.println(aws1);
        System.out.println(aws2);
        System.out.println(aws3);
        System.out.println(aws4);
        
        sc.close();
	}

}
