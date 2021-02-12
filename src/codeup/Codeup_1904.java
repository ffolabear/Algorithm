package codeup;

import java.util.Scanner;

public class Codeup_1904 {

	static int recursion(int a, int b) {
		
		if(a <= b ) {
			
			if(a %2 ==1) {
				System.out.print(a + " ");
			}
			
			recursion(a + 1, b);
		}
		

		
		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		recursion(a,b);
	}

}
