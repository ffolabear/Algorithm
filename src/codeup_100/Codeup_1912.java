package codeup_100;

import java.util.Scanner;

public class Codeup_1912 {
	
	static int val = 1;

	static int recursion(int a) {

		if(a == 1) {
			
			return a;
		
		} else {
			val = a * recursion(a-1);
		}
		
		return val;
		
	}

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;

		System.out.println(recursion(a));
		
		
	}

}