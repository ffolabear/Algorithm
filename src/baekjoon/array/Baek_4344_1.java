package baekjoon.array;

import java.util.Scanner;

public class Baek_4344_1 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] arr;
		
		for(int i =0; i < test ; i++ ) {
			
			int student = sc.nextInt();
			arr = new int[student];
			
			int total = 0;
			
			for(int j=0; j< student; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				total += score;
			}
			
			double avg = total/student;
			double per = 0;
			double cnt =0;
			
			for(int k=0; k <student; k++ ) {
				
				if (arr[k] > avg) {
					cnt++;
				}
				
			}
			
			per = cnt / student * 100;
			System.out.printf("%.3f%%\n", per);
		}
	}
}
