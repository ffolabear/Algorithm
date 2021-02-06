package codeup_100;

import java.util.Scanner;

public class Codeup_1916 {
	
	static int[] arr;
	static final int idx = 200;
	
	static int recursion(int n) {
		
		if(n == 1 || n==2) {
			return 1;
		}
		
		
		if(arr[n] != 0) {
			return arr[n];
		} 
		
		
		arr[n] = recursion(n-1) + recursion(n-2); 
		
		return arr[n]%(10009);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		arr = new int[idx + 1];
		
		System.out.println(recursion(n));

	}

}
