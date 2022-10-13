package baekjoon.recursive;

import java.util.Scanner;

public class Boj_10870_Arr {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N+1];
		
		
		
		for(int i=0; i < arr.length ; i++) {
			
			if(i == 0) {
				arr[i] = 0;
			}
			
			else if(i == 1) {
				arr[i] = 1;
			}
			
			else {
				
				arr[i] = arr[i-1] + arr[i-2];
			}
			
		}
		
		
		for(int i=1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println(N + "번째 피보나치수 : " + arr[N]);
	}
	
	
}
