package BaekJoon;

import java.util.*;

public class beak_while1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();		
			if ( A>0 && B<10) {
			System.out.println(A+B);
			} 
			if (A==0 && B == 0)
			break;
		}
		
	}
}
