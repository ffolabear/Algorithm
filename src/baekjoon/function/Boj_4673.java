package baekjoon.function;

public class Boj_4673 {

	public static void main(String[] args) {

		boolean[] chk = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				chk[n] = true;
			}
		}
		
		for(int i = 1; i <chk.length; i++) {
			
			if(!chk[i]) {
				System.out.println(i);
			}
			
			
		}

	}

	public static int d(int n) {

		int val = n;

		while (n != 0) {

			val = val + n % 10;
			n /= 10;

		}

		return val;
	}

}
