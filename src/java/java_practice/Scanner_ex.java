package java.java_practice;

import java.util.Scanner;

public class Scanner_ex {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
 
        System.out.println(a + b);
		
		
	}

}
