package baekjoon_for;

import java.util.*;

public class Baek_8393 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res=0;
		if (n >=1 && n<= 10000) {
			for(int i=0 ; i <=n ; i++) {
				res += i;
			}
			System.out.println(res);
		}
	}

}
