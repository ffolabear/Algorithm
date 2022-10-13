package baekjoon.loop_while;

import java.util.Scanner;

public class Boj_1110_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int cnt = 0;
		int num = N;
		
		while (true) {
			
			N = (N%10*10) + ((N/10) + (N%10))%10;
			cnt ++;
			if(num == N) {
				break;
			}
			
		}
		System.out.println(cnt);
		
		
		/* do-while도 가능
		 
		 do {
			N = (N%10*10) + ((N/10) + (N%10))%10;
			cnt ++;
			
		}  while ( num != N); 
		
		System.out.println(cnt);
		 	
		 	
		 */
		
		
		
		
		
		
		
		
		
	}

}