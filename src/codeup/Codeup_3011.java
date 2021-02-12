package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_3011 {
	
	static int sort(int[] arr) {
		
		int k=0;
		
		
		for(int i = 0 ; i < arr.length; i++) {
			
			for(int j = arr.length -1 ; j > i ; j--) {
				
				if(arr[j-1] > arr[j]) {
					
					int ptr = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = ptr;
				}
			}
			
		}
		
		while(k < arr.length -1 ) {
			
			int last = arr.length - 1;
			
			for(int j = arr.length -1 ; j > k ; j--) {
				
				if(arr[j-1] > arr[j]) {
					
					int ptr = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = ptr;
					last = j;
				}
				k = last;
			}
			
		}
		
		System.out.println(k);
		
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new  InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		int[] arr = new int[n];
		String str = bf.readLine();
		String[] str1 = str.split(" ");
		
		
		for(int i = 0; i <str1.length; i++) {
			arr[i] = Integer.parseInt(str1[i]);
		}
		
		sort(arr);
		
		
		
		
	}

}
