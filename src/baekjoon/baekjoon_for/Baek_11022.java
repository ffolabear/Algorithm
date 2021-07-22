package baekjoon.baekjoon_for;

import java.util.*;

public class Baek_11022 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		
		
		for(int i=1 ; i<N+1 ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(0 < A && B < 10) {
				int C = A + B;
				System.out.println("Case #"+i+": "+(A)+" + "+(B)+" = "+(C));
			} 
		}
		
	}

}
