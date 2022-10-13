package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_1427 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[(int)(Math.log10(N) + 1)];
		
		
		
		int val = N;
		int cnt = 0;
		
		while( val != 0) {
			
			val = N%10;
			
			if(val == 0) {
				break;
			} else {
				arr[cnt] = val;
				cnt++;
			}
			
			N /= 10;
			
		}
				
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
