package codeup_100;

import java.util.Scanner;

public class Codeup_1915 {
	
	static int cnt=1;
	
	static int recursion(int n) {
		
		if(n == 1) {
			return 1;
		}
		
		if(n == 2) {
			return 1;
		}
		
		
		return recursion(n-1) + recursion(n-2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(recursion(n));

	}

}
