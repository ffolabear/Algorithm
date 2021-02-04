package Algo_practice;

import java.util.Scanner;

public class Recursive_Uclid {
	
	
	static int gcd(int x, int y) {
		
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return (x);
	}
	
	static int gcdArray(int[] arr, int start, int length) {
		
		
		if(length == 1) {
			return arr[start];
			
		} else if (length == 2) {
			return gcd(arr[start], arr[start+1]);
			
		} else {
			
			return gcd(arr[start], gcdArray(arr, start +1, length -1));
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇개의 수의 최대 공약수를 구할까요? ：");	
		int x = sc.nextInt();
		
		int[] arr = new int[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("정수를 입력하세요：");	
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println(gcdArray(arr, 0, x));
		
	}

}
