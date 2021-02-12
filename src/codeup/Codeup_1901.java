package codeup;

import java.util.Scanner;

public class Codeup_1901 {
	
	static int recursion(int N) {
		
		if(N > 1) {
			recursion(N-1);
		}
		
		System.out.println(N);
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		recursion(N);
	}

}
