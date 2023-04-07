package algo_practice;

import java.util.Random;
import java.util.Scanner;

public class Shaker_Sort {
	
	
	
	static void swap(int index1, int index2, int[] arr) {
		
		int ptr = arr[index1];
		arr[index1] = arr[index2]; 
		arr[index2] = ptr;
		
	}
	
	static void shaker(int[] arr) {
		
		int right = arr.length - 1;
		int left = 0;
		int last = right;
		
		while(left < right) {
			
			for(int i = left; i < right; i++) {
				
				if(arr[i] > arr[i +1]) {
					swap(i, i + 1, arr);
					last = i;
				}
				
			}
			right = last;
			
			
			for(int j = right; j >  left; j--) {
				
				if(arr[j-1] > arr[j]) {
					swap(j-1, j, arr);
					last = j;
				}
				
			}
			left = last;
			
			
		}
		
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(11);
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		
		shaker(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
