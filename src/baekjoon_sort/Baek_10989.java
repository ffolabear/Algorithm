package baekjoon_sort;

import java.util.Scanner;

public class Baek_10989 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int max = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			if(arr[i] < arr[i+1]) {
				max = arr[i+1];
			}
		}
		System.out.println(max);
		
		int[] counting = new int[max];
		
		for(int i = 0; i < arr.length; i++) {
			counting[arr[i]-1]++; 
		}
		
		
		for(int i = 0; i < counting.length; i++) {
			System.out.println("i :" + i + " / " + counting[i]);
			
		}
		System.out.println("==================================");
		
		for(int i = 1; i < counting.length; i++) {
			counting[i] += counting[i - 1];
			
		}
		
		System.out.println("==================================");
		
		for(int i = 0; i < counting.length; i++) {
			System.out.println("i :" + i + " / " + counting[i]);
			
		}
		
		for(int i = 0; i < counting.length; i++) {
			
			
			
		}
		
		
		
		
		
	}

}
