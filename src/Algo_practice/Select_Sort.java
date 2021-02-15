package Algo_practice;

import java.util.Random;
import java.util.Scanner;

public class Select_Sort {
	
	static void swap(int index1, int index2, int[] arr) {
		
		int ptr = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = ptr;
		
	}
	
	
	static void selectsort(int[] arr) {
		
		for(int i = 0; i < arr.length; i ++) {
			
			int min = i;
			for(int j = i+1 ; j < arr.length; j++) {
				
				if(arr[j] < arr[min]) {
					min = j;
				}
				swap(i, min, arr);
			}
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
		
		selectsort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
