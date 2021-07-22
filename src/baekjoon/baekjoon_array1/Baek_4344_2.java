package baekjoon.baekjoon_array1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_4344_2 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr;
		int test = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		
		for(int i=0; i< test ; i++) {
			
			st = new StringTokenizer(bf.readLine(), " ");
			int student = Integer.parseInt(st.nextToken());
			
			arr = new int[student];
			
			double total = 0;
			
			for(int j=0; j < student; j++) {
				
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				total += val;
			}
			
			double avg = total / student;
			double cnt = 0;
			double per = 0;
			
			for(int k=0; k < student; k++) {
				if(arr[k] > avg) {
					cnt++;
				}
			}
			per = cnt / student * 100;
			System.out.printf("%.3f%%\n", per);
		}
		
		
	}

}
