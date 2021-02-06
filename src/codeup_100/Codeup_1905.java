package codeup_100;

import java.util.Scanner;

public class Codeup_1905 {
	
	static int sum = 0;

	static int recursion(int a) {
		
		if(a == 0) {
			return a;
		} else {
			recursion(a-1);
		}
		
		return sum += a;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;

		
		System.out.println(recursion(a));
	}

}
