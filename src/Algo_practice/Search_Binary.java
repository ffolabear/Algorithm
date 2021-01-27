package Algo_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Search_Binary {
	
	
	static int seqSearch(int[] arr, int len, int find) {
		
		int startPoint = 0;
		int endPoint = len-1;
		
		do {
			
			int standard = (endPoint + startPoint)/2;
			if(arr[standard] == find) {
				
				return standard;
				
			} else if (arr[standard] > find) {
				
				endPoint = standard + 1;
				
			} else if(arr[standard] < find) {
				
				startPoint = startPoint -1; 
				
			}
			
			
		} while(startPoint < endPoint);
		
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 입력해주세요. : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		for(int i=0; i < len ; i++) {
			System.out.print("arr["+ i + "] : ");
			arr[i] = sc.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		System.out.print("찾고싶은 값을 입력하세요 : ");
		int find = sc.nextInt();
		
		int aws = seqSearch(arr, len, find);
		
		if(aws == -1) {
			System.out.println("찾는 값이 없습니다.");
		} else {
			System.out.println("찾는 값은 arr[" + aws + "] 에 있습니다.");
		}
		
		
	}

}
