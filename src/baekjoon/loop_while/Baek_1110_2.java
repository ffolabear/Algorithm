package baekjoon.loop_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1110_2 {

	public static void main(String[] args) throws Exception, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int num = N;
		int cnt =0;
		
//		while(true) {
//			
//			N = ((N%10)*10) + ((N/10) + (N%10))%10;
//			cnt ++;
//			
//			if(N == num) {
//				break;
//			}
//		}
//		System.out.println(cnt);
		
		
		do {
			
			N = ((N%10)*10) + ((N/10) + (N%10))%10;
			cnt ++;
			
		} while (N != num);
		System.out.println(cnt);
	}

}